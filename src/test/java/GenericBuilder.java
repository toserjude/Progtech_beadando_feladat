import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class GenericBuilder<T> {

    public static <T> GenericBuilder<T> of(Supplier<T> instantiator) {
        return new GenericBuilder<>(instantiator);
    }

    private List<Consumer<T>> instanceModifiers = new ArrayList<>();

    private final Supplier<T> instantiator;

    public GenericBuilder(Supplier<T> instantiator) {
        this.instantiator = instantiator;
    }

    public T build() {
        T value = this.instantiator.get();
        this.instanceModifiers.forEach(modifier -> modifier.accept(value));
        this.instanceModifiers.clear();
        return value;
    }

    public GenericBuilder<T> with(Consumer<T> consumer) {
        this.instanceModifiers.add(consumer);
        return this;
    }
}

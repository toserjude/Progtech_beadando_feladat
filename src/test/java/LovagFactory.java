public class LovagFactory {
    static final Lovag LOVAG = GenericBuilder.of(Lovag::new)
            .with(Lovag::setEro)
            .with(Lovag::setGyorsasag)
            .with(Lovag::setAllokepesseg)
            .with(Lovag::setUgyesseg)
            .with(Lovag::setEgeszseg)
            .with(Lovag::setSzepseg)
            .with(Lovag::setIntelligencia)
            .with(Lovag::setAkaratero)
            .with(Lovag::setAsztral)
            .with(Lovag::setEp)
            .with(Lovag::setFp)
            .with(Lovag::setKE)
            .with(Lovag::setTE)
            .with(Lovag::setVE)
            .with(Lovag::setCE)
            .with(Lovag::setPszipont)
            .with(Lovag::setManapont)
            .build();

}

Programozási technológiák beadandó feladat

Karaktergeneráló alkalmazás M.A.G.U.S. rendszerű szerepjátékhoz

Az alkalmazás célja: 
M.A.G.U.S. rendszerű szerepjátékhoz induló karakter legenerálása a felhasználó által megadott kombinációban konzolos alkalmazásban, 
vagy teljesen véletlenszerű kombinációban, az Első Törvénykönyv szabályrendszerének megfelelően.

Tervezési alapelveknek való megfelelés:
GOF2 - stratégia alkalmazása (objektumösszetétel miatt)
OCP - absztakt osztályok és metódusok írása, ezek bővítése törzzsel a gyermekosztályokban

Használt tervezési minták:
strategy: a karakteralkotási folyamat minden egyes esetben ugyanazokból a lépésekből állnak, de az értékek 
különböző módon kerülnek kiszámításra
decorator: bizonyos tulajdonságok alapján (faj) különböző bónuszok és hátrányok befolyásolják a karakter értékeit
builder: tesztpéldány létrehozásához

Unit tesztelés:
random számot előállító metódusok tesztelése, adott metódus a megfelelő tartományba eső számot adja-e vissza
dekorátor tervezési minta tesztelése
szabályrendszernek való megfelelést vizsgáló metódus(ok) tesztelése, property-k értékének vizsgálata


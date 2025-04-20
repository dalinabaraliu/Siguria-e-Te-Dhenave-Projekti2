# Projekti në lëndën Siguria e të Dhënave - Cipher Program


Ky projekt implementon dy algoritme enkriptimi dhe dekriptimi:  **Single Letter Grilles** dhe **Tap Code** në gjuhën Java. Programi ofron një ndërfaqe të thjeshtë ku përdoruesi zgjedh algoritmin dhe jep tekstin për enkriptim ose dekriptim.

## Përmbajtja
- Përshkrimi i Algoritmeve
    - Single Letter Grilles
    - Tap Code
- Udhëzime për Ekzekutim
    - Kërkesat
    - Strukturimi i Skedarëve
    - Kompilimi
    - Ekzekutimi
- Shembuj të Ekzekutimit
    - Single Letter Grilles
    - Tap Code
- Përfundim
- .gitignore

## Përshkrimi i Algoritmeve
#### 1. Single Letter Grilles:
Single Letter Grilles është një metodë ku teksti vendoset në një matricë katrore dhe plotësohet në mënyrë spirale (në drejtim të akrepave të orës). Gjatë enkriptimit, karakteret shpërndahen sipas këtij modeli. Nëse mbesin hapësira të zbrazëta, ato plotësohen me karakterin `_`.

- Enkriptimi: Teksti vendoset spiralisht në matricë.

- Dekriptimi: Teksti lexohet përsëri në mënyrë spirale për të rikuperuar tekstin fillestar, duke injoruar karakteret `_`.

#### 2. Tap Code
Tap Code është një sistem komunikimi i bazuar në një matricë 5x5 ku secila shkronjë përfaqësohet përmes numrit të pikave (`.`). Një grup pikash para hapësirës tregon rreshtin, dhe një grup pas hapësirës tregon kolonën.

- Enkriptimi: Çdo shkronjë përkthehet në kombinime pikash sipas pozicionit të saj në matricë.

- Dekriptimi: Kombinimi i pikave rikthen shkronjën origjinale nga matrica.

Shënim: Në këtë kodim, `K` trajtohet si `C`, siç është standardi i Tap Code.
## Udhëzime për Ekzekutim
### Kërkesat:
- Java (JDK)
- IntelliJ IDEA ose çdo mjedis Java.

### Strukturimi i Skedarëve
Sigurohuni që keni të instaluar Java (versioni 8 ose më i ri).

Ruani të gjitha skedarët brenda një dosjeje cipher/ si p.sh.:
``` 
src/cipher/
    Main.java
    SingleLetterGrilles.java
    TapCode.java
```




### Kompilimi:
Nga terminali/komanda, navigoni në rrënjën e projektit (ku ndodhet dosja `src/`) dhe kompiloni skedarët me komandën:
```bash
javac src/cipher/*.java
```

### Ekzekutimi:
Pastaj, ekzekutoni programin:
```bash
java -cp src cipher.Main
```
Ndiqni udhëzimet në ekran për të zgjedhur algoritmin dhe për të futur tekstin që doni të enkriptoni/dekriptoni.
## Shembuj

### Single Letter Grilles
- Zgjidhni algoritmin: `1`
- Shkruani tekstin: `HELLO`
- Enkriptuar: `HEL__L_O_`
- Dekriptuar: `HELLO`



### Tap Code
- Zgjidhni algoritmin: `2`
- Shkruani tekstin: `HELLO`
- Enkriptimi: `.... . . ..... . .... .... ....`
- Dekriptimi: `HELLO`

## Përfundim
Ky projekt demonstron dy metoda klasike të enkriptimit dhe dekriptimit dhe ofron një bazë të mirë për të kuptuar teknikat bazë të kodimit të thjeshtë të të dhënave.

## .gitignore
Skedarët që nuk duhen ngarkuar në GitHub:
```
*.class
*.jar
.idea/
*.iml
.DS_Store
```
# Programare avansata pe obiecte - proiect (233)


Fiecare student va lucra la un proiect individual.
Proiectul este structurat in mai multe etape, inaine de finalul fiecareia trebuie sa uploadati pe github rezolvarile. Nu se mai iau in considerare rezolvarile uploadate dupa termen!
Conditia de punctare a proiectelor:
- sa nu prezinte erori de compilare 
- sa se implementeze cerintele date.

Termene de predare:
- Etapa I: 30 martie
- Etapa II: 27 aprilie
- Etapa III: 25 mai

## Etapa I

### 1) Definirea sistemului
Sa se creeze o lista pe baza temei alese cu cel putin 10 actiuni/interogari care se pot face in cadrul sistemului si o lista cu cel putin 8 tipuri de obiecte.

### 2) Implementare
Sa se implementeze in limbajul Java o aplicatie pe baza celor definite la primul punct. 

Aplicatia va contine:
- clase simple cu atribute private / protected si metode de acces;
- cel putin 2 colectii diferite capabile sa gestioneze obiectele definite anterior (ex: List, Set, Map, etc.) dintre care cel putin una sa fie sortata;
– se vor folosi array-uri uni/bidimensionale in cazul in care nu se parcurg colectiile pana la data checkpoint-ului.
- utilizare mostenire pentru crearea de clase aditionale si utilizarea lor in cadrul colectiilor;
- cel putin o clasa serviciu care sa expuna operatiile sistemului;
- o clasa Main din care sunt facute apeluri catre servicii;

## Etapa II
### 1) Extindeti proiectul din prima etapa prin realizarea persistentei utilizand fisiere:

- Se vor realiza fisiere de tip CSV pentru cel putin 4 dintre clasele definite in prima etapa.
Fiecare coloana din fisier este separata de virgula. Exemplu: nume,prenume,varsta

- Se vor realiza servicii generice pentru scrierea si citirea din fisiere;

- La pornirea programului se vor incarca datele din fisiere utilizand serviciile create;

### 2) Realizarea unui serviciu de audit

Se va realiza un serviciu care sa scrie intr-un fisier de tip CSV de fiecare data cand este executata una dintre actiunile descrise in prima etapa. 

Structura fisierului: nume_actiune, timestamp


## Etapa III

### Inlocuiti serviciile realizate in etapa a II-a cu servicii care sa asigure persistenta utilizand baza de date (folosind JDBC).

Sa se realizeze servicii care sa expuna operatii de tip create, read, update si delete pentru cel putin 4 dintre clasele definite.

## Bonus
Interfata grafica :)

## Teme:
1) catalog (student, materie, profesor)
2) biblioteca (sectiuni, carti, autori, cititori)
3) programare cabinet medical (client, medic, programare)
4) gestiune stocuri magazin (categorii, produse, distribuitori)
5) aplicatie bancara (conturi,extras de cont, tranzactii, carduri, servicii)
6) platforma e-learning(cursuri, utilizatori, cursanti, quizuri)
7) sistem licitatii (licitatii, bids, produse, utilizatori)
8) platforma food delivery (localuri, comenzi, soferi, useri)
9) platforma imprumuturi carti - tip bookster (companii afiliate, utilizatori, carti)
10) platforma e-ticketing (evenimente, locatii, clienti)

                                                         Documentatie Proiect de Testare Automata


	Aceasta documentatie detaliaza proiectul de testare al site-ului https://ecommerce-playground.lambdatest.io/si contine informatii despre functionalitatile
 site-ului, structura testelor si modul de utilizare al acestora.


	Proiectul utilizeaza design pattern-ul Page Object Model  si foloseste ca framework Selenium WebDriver. Testele sunt rulate cu ajutorul framework-ului TestNG. 


	Pentru a putea rula testele, este necesar sa instalam tool-ul Maven.  Fisierul pom.xml contine dependintele Maven pentru intregul proiect, depedinte pentru
 Selenium , ChromeDriver, TestNG.


	Fiecare test case deschide o instanta de Google Chrome  care se va inchide la finalul fiecarui test, conform setarilor de baza aflate in clasa BasePage. 



	Scopul acestui proiect este sa dezvolte si sa testeze un set de functionalitati pentru site-ul E-commerce. Acesta include teste pentru autentificare, cautare,
 adaugare de produse in cosul de cumparaturi, functionalitatile de wishlist si altele.

	Proiectul este impartit in mai multe pachete si clase, responsabile de o anumita functionalitate sau scenariu de testare. Structura pachetelor este urmatoarea:


    • pages – contine clasele care modeleaza diferite pagini ale aplicatiei;
      
    • testCases -  contine clasele care implementeaza diferite scenrii de testare pentru functionalitatile aplicatiei.


	Pachetul pages  contine clasele:


    • BasePage – aici gasim toate configurarile si prerechizitele necesare metodelor si testelor folosite;
      
    • clasele HomePage, MyAccount, InputControls, ProdutDetail, SearchPage, ShoppingCart -  acestea contin locatorii si metodele necesare rularii fiecarui test case.


	Pachetul testCases  contine clasele care implementeaza scenarii de testare pentru functionalitatile site-ului.


	Procesele care au loc in timpul rularii testelor pot fi observate in tab-ul Run, care ofera informatii despre starea testelor in desfasurare. 



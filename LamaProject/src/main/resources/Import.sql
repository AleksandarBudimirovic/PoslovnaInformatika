
INSERT INTO `poslovnaLamadb`.`mesto` (`grad`,`obrisano`) VALUES ('Sremska MItrovica', false);
INSERT INTO `poslovnaLamadb`.`mesto` (`grad`, `obrisano`) VALUES ('Novi Sad', false);
INSERT INTO `poslovnaLamadb`.`mesto` (`grad`, `obrisano`) VALUES ('Subotica',false);
INSERT INTO `poslovnaLamadb`.`mesto` (`grad`, `obrisano`) VALUES ('Vrsac', false);
INSERT INTO `poslovnaLamadb`.`mesto` (`grad`, `obrisano`) VALUES ('Beograd', false);
INSERT INTO `poslovnaLamadb`.`mesto` (`grad`, `obrisano`) VALUES ('Pancevo', false);

INSERT INTO `poslovnaLamadb`.`preduzece` (`pib`, `adresa`, `email`, `naziv_preduzeca`, `tekuci_racun`, `telefon`, `mesto_id`) VALUES ('123456789', 'Nikola Tesla', 'lamapreduzece@gmail.com', 'Lama preduzece', '12309812', '069655990', '1');

INSERT INTO `poslovnaLamadb`.`poslovni_partner` (`pib`, `adresa`, `naziv_poslovnog_partnera`, `obrisano`, `tekuci_racun`, `tip_poslovnog_partnera`, `mesto_id`, `preduzece_id`) VALUES ('111222333', 'Bulevar Oslobodjenja', 'WinWin', false, '555666', '0', '1', '1');
INSERT INTO `poslovnaLamadb`.`poslovni_partner` (`pib`, `adresa`, `naziv_poslovnog_partnera`, `obrisano`, `tekuci_racun`, `tip_poslovnog_partnera`, `mesto_id`, `preduzece_id`) VALUES ('555533445', 'Nikole Pasica', 'Gigatron', false , '787878', '0', '2', '1');
INSERT INTO `poslovnaLamadb`.`poslovni_partner` (`pib`, `adresa`, `naziv_poslovnog_partnera`, `obrisano`, `tekuci_racun`, `tip_poslovnog_partnera`, `mesto_id`, `preduzece_id`) VALUES ('987987987', 'Svetozara Miletica', 'Tehnomanija', false, '696963', '1', '3', '1');

INSERT INTO `poslovnaLamadb`.pdv (vrsta_pdv,obrisano) VALUES ('Opsti',false);
INSERT INTO `poslovnaLamadb`.pdv (vrsta_pdv,obrisano) VALUES ('Poseban',false);

INSERT INTO `poslovnaLamadb`.stopa_pdv (rok_vazenja,obrisano,procenat,pdv_id) VALUES ('2022-05-15 07:07:07.000',0,25,1);
INSERT INTO `poslovnaLamadb`.stopa_pdv (rok_vazenja,obrisano,procenat,pdv_id) VALUES ('2022-08-24 07:07:07.000',0,18,2);

INSERT INTO `poslovnaLamadb`.grupa_robe (naziv,obrisano,preduzece_id, pdv_id) VALUES ('Klima uredjaji',0,1,1);
INSERT INTO `poslovnaLamadb`.grupa_robe (naziv,obrisano,preduzece_id, pdv_id) VALUES ('Kucni aparati',0,1,2);
INSERT INTO `poslovnaLamadb`.grupa_robe (naziv,obrisano,preduzece_id, pdv_id) VALUES ('Bela tehnika',0,1,1);
INSERT INTO `poslovnaLamadb`.grupa_robe (naziv,obrisano,preduzece_id, pdv_id) VALUES ('Muzicki uredjaji',0,1,1);
INSERT INTO `poslovnaLamadb`.grupa_robe (naziv,obrisano,preduzece_id, pdv_id) VALUES ('TV',0,1,1);
INSERT INTO `poslovnaLamadb`.grupa_robe (naziv,obrisano,preduzece_id, pdv_id) VALUES ('Racunari',0,1,1);
INSERT INTO `poslovnaLamadb`.grupa_robe (naziv,obrisano,preduzece_id, pdv_id) VALUES ('Telefoni',0,1,1);
INSERT INTO `poslovnaLamadb`.grupa_robe (naziv,obrisano,preduzece_id, pdv_id) VALUES ('Auto tehnika',0,1,2);
INSERT INTO `poslovnaLamadb`.grupa_robe (naziv,obrisano,preduzece_id, pdv_id) VALUES ('Kamere',0,1,2);
INSERT INTO `poslovnaLamadb`.grupa_robe (naziv,obrisano,preduzece_id, pdv_id) VALUES ('Fotoaparati',0,1,1);


INSERT INTO `poslovnaLamadb`.roba (jedinica_mere, naziv_robe, obrisano, grupa_robe_id) VALUES ('komad', 'Xiamomi Redmi 9C ', false, 7);
INSERT INTO `poslovnaLamadb`.roba (jedinica_mere, naziv_robe, obrisano, grupa_robe_id) VALUES ('komad', 'Samsung Galaxy j7', false, 7);
INSERT INTO `poslovnaLamadb`.roba (jedinica_mere, naziv_robe, obrisano, grupa_robe_id) VALUES ('komad', 'Bosch mikrotalasna rerna ', false, 3);
INSERT INTO `poslovnaLamadb`.roba (jedinica_mere, naziv_robe, obrisano, grupa_robe_id) VALUES ('komad', 'Altos desktop racunar Hunter 240 GB', false, 6);
INSERT INTO `poslovnaLamadb`.roba (jedinica_mere, naziv_robe, obrisano, grupa_robe_id) VALUES ('komad', 'HP i5 8GB', false, 6);
INSERT INTO `poslovnaLamadb`.roba (jedinica_mere, naziv_robe, obrisano, grupa_robe_id) VALUES ('komad', 'Asus laptop racunar 8GB, 256SSD ', false, 6);
INSERT INTO `poslovnaLamadb`.roba (jedinica_mere, naziv_robe, obrisano, grupa_robe_id) VALUES ('komad', 'Samsung 50inch', false, 5);
INSERT INTO `poslovnaLamadb`.roba (jedinica_mere, naziv_robe, obrisano, grupa_robe_id) VALUES ('komad', 'Samsung soundbar 2.1ch', false, 4);
INSERT INTO `poslovnaLamadb`.roba (jedinica_mere, naziv_robe, obrisano, grupa_robe_id) VALUES ('komad', 'Yamaha Compas NTX', false, 10);
INSERT INTO `poslovnaLamadb`.roba (jedinica_mere, naziv_robe, obrisano, grupa_robe_id) VALUES ('komad', 'Yale Dome kamera', false, 9);
INSERT INTO `poslovnaLamadb`.roba (jedinica_mere, naziv_robe, obrisano, grupa_robe_id) VALUES ('komad', 'LG 32unch', false, 5);
INSERT INTO `poslovnaLamadb`.roba (jedinica_mere, naziv_robe, obrisano, grupa_robe_id) VALUES ('komad', 'Toshiba 42', false, 5);
INSERT INTO `poslovnaLamadb`.roba (jedinica_mere, naziv_robe, obrisano, grupa_robe_id) VALUES ('komad', 'Bosch masina za pranje sudova', false, 3);

INSERT INTO `poslovnaLamadb`.`cenovnik` (`kraj_roka_trajanja`, `obrisano`, `pocetak_roka_trajanja`, `poslovni_partner_id`, `preduzece_id`) VALUES ('2022-06-18', false, '2020-12-18', '1', '1');
INSERT INTO `poslovnaLamadb`.`cenovnik` (`kraj_roka_trajanja`, `obrisano`, `pocetak_roka_trajanja`, `poslovni_partner_id`, `preduzece_id`) VALUES ('2024-07-05', false, '2019-08-06', '2', '1');
INSERT INTO `poslovnaLamadb`.`cenovnik` (`kraj_roka_trajanja`, `obrisano`, `pocetak_roka_trajanja`, `poslovni_partner_id`, `preduzece_id`) VALUES ('2022-11-11', false, '2018-11-10', '3', '1');

INSERT INTO `poslovnaLamadb`.`poslovna_godina` (`godina_poslovanja`, `obrisano`, `zakljucena_godina`) VALUES ('2021', false, false);

INSERT INTO `poslovnaLamadb`.`stavke_cenovnika` (`cena`, `cenovnik_id`, `obrisano`, `roba_id`) VALUES ('15000', 1, false, 1);
INSERT INTO `poslovnaLamadb`.`stavke_cenovnika` (`cena`, `cenovnik_id`, `obrisano`, `roba_id`) VALUES ('20000', 1, false, 2);
INSERT INTO `poslovnaLamadb`.`stavke_cenovnika` (`cena`, `cenovnik_id`, `obrisano`, `roba_id`) VALUES ('19000', 1, false, 3);
INSERT INTO `poslovnaLamadb`.`stavke_cenovnika` (`cena`, `cenovnik_id`, `obrisano`, `roba_id`) VALUES ('35000', 1, false, 4);
INSERT INTO `poslovnaLamadb`.`stavke_cenovnika` (`cena`, `cenovnik_id`, `obrisano`, `roba_id`) VALUES ('45000', 1, false, 5);
INSERT INTO `poslovnaLamadb`.`stavke_cenovnika` (`cena`, `cenovnik_id`, `obrisano`, `roba_id`) VALUES ('21000', 1, false, 6);

INSERT INTO `poslovnaLamadb`.`stavke_cenovnika` (`cena`, `cenovnik_id`, `obrisano`, `roba_id`) VALUES ('15000', 2, false, 1);
INSERT INTO `poslovnaLamadb`.`stavke_cenovnika` (`cena`, `cenovnik_id`, `obrisano`, `roba_id`) VALUES ('20000', 2, false, 2);
INSERT INTO `poslovnaLamadb`.`stavke_cenovnika` (`cena`, `cenovnik_id`, `obrisano`, `roba_id`) VALUES ('19000', 2, false, 3);
INSERT INTO `poslovnaLamadb`.`stavke_cenovnika` (`cena`, `cenovnik_id`, `obrisano`, `roba_id`) VALUES ('35000', 2, false, 4);
INSERT INTO `poslovnaLamadb`.`stavke_cenovnika` (`cena`, `cenovnik_id`, `obrisano`, `roba_id`) VALUES ('45000', 2, false, 5);
INSERT INTO `poslovnaLamadb`.`stavke_cenovnika` (`cena`, `cenovnik_id`, `obrisano`, `roba_id`) VALUES ('21000', 2, false, 6);

INSERT INTO `poslovnaLamadb`.`stavke_cenovnika` (`cena`, `cenovnik_id`, `obrisano`, `roba_id`) VALUES ('15000', 3, false, 1);
INSERT INTO `poslovnaLamadb`.`stavke_cenovnika` (`cena`, `cenovnik_id`, `obrisano`, `roba_id`) VALUES ('20000', 3, false, 2);
INSERT INTO `poslovnaLamadb`.`stavke_cenovnika` (`cena`, `cenovnik_id`, `obrisano`, `roba_id`) VALUES ('19000', 3, false, 3);
INSERT INTO `poslovnaLamadb`.`stavke_cenovnika` (`cena`, `cenovnik_id`, `obrisano`, `roba_id`) VALUES ('35000', 3, false, 4);
INSERT INTO `poslovnaLamadb`.`stavke_cenovnika` (`cena`, `cenovnik_id`, `obrisano`, `roba_id`) VALUES ('45000', 3, false, 5);
INSERT INTO `poslovnaLamadb`.`stavke_cenovnika` (`cena`, `cenovnik_id`, `obrisano`, `roba_id`) VALUES ('21000', 3, false, 6);

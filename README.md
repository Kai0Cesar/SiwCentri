# SiwCentri

Allievi: Edoardo Montebelli [487882] e Kaio Cesar Alves Reis [484997]
Progetto: Software Informativi sul Web 2017/2018

Considerazioni generali:

E' stata un'esperienza molto formativa, in quanto ti mette davanti ostacoli apparentemente insormontabili e per i quali devi sbatterci la testa per superarli.
Ci ha insegnato a interagire e a lavorare meglio in gruppo, e a confrontarmi con altri colleghi.

Funzionalità incomplete: Assegnamento di un ruolo con il login fatto tramite OAuth2.

Casi d'Uso

1-Gestione iscrizione allievo attività - Attore primario: Responsabile
Pre-Cond: Il Responsabile è identificato e autenticato

1. Un Allievo si presenta in un centro per l'iscrizione a un'attività
2. Il Responsabile inizia una nuova iscrizione (attività)
3. Il Responsabile inserisce i dati forniti nel Sistema
4. Il Sistema verifica i dati forniti
	a. Se l'allievo non ha mai partecipato a un'attività formativa del centro/azienda
	4a. Il Sistema mostra un messaggio di avvertimento
	5a. Il Responsabile inizia una nuova registrazione al Sistema
	6a. Il Sistema mostra l'avvenuta registrazione
	b. Se l'Allievo è gia iscritto
	4b. Il Sistema recupera i dati
8. Il Sistema mostra un resoconto delle iscrizioni
9. Il Responsabile conferma

2-Gestione cancellazione iscrizione attività
Pre-Cond: Il Responsabile è identificato e autenticato

1. Un Allievo disdice un iscrizione a un'attività
2. Il Responsabile seleziona l'attività
3. Il Sistema mostra la lista degli iscritti
4. Il Responsabile richiede al Sistema la cancellazione dell'iscrizione dell'Allievo
5. Il Sistema mostra la nuova lista degli iscritti
6. Il Sistema avvisa automaticamente la successiva riserva

3-Monitoraggio attività
Pre-Cond: Il Responsabile è identificato e autenticato

1. Il Responsabile richiede al Sistema le informazioni relative alle attività
2. Il Sistema mostra l'elenco di tutte le attività di tutti i centri
3. Il Responsabile inserisce i criteri di ricerca
4. Il Sistema mostra l'elenco in base ai criteri

4-Gestisci attività
Pre-Cond: Il Responsabile è identificato e autenticato

1. Il Responsabile richiede al Sistema di gestire un'attività
2. Il Sistema mostra l'elenco delle operazioni che può effettuare 
	a.In caso di creazione
		1a. Il Responsabile inserisce i dati
		2a. Il Sistema crea la nuova attività
		3a. Il Sistema inserisce l'attività nell'elenco in base alla data
	c.In caso di Eliminazione
		1c. Il Sistema elimina l'attività dall'elenco
		2c. Il Sistema avvisa automaticamente gli Allievi iscritti

5-Aggiunta nuovo centro - Attore primario: Resposabile dell'azienda
Pre-Cond: Il Responsabile è indetificato e autenticato

1. Il Responsabile richiede al Sistema la creazione di un nuovo centro
2. Il Sistema richiede i dati del nuovo centro
3. Il Responsabile fornisce i dati
4. Il Sistema crea il nuovo centro e lo aggiunge alla lista</pre>

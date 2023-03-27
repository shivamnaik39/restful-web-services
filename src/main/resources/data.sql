insert into user_details(id,birth_date,name) 
values
( 1001, '2000-05-05', 'Shivam Naik'),
( 1002, '1995-09-12', 'Eren Yegaer'),
( 1003, '1992-03-23', 'Ryguji Ken')
;


insert into post(id,description, user_id)
values
(2001, 'Hey, this is my first post!!', 1001),
(2002, 'Random Post...', 1001),
(2003, 'Greatest salvation is never being born...', 1002),
(2004, 'Mikeyy kun', 1003)
;
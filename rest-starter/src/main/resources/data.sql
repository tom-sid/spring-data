insert into author(id, first_name, last_name) values (1, 'John', 'Hopkins');

insert into post(id, body, posted_on, title, author_id) values (1, 'Java Body', current_date(), 'My Blog', 1);
insert into post(id, body, posted_on, title, author_id) values (2, 'Spring Body', current_date(), 'My Blog', 1);
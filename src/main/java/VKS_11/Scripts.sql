CREATE TABLE users (
	user_id SERIAL PRIMARY KEY,
	name VARCHAR(20) NOT NULL,
	surname VARCHAR(20) NOT NULL,
	date_of_registration DATE NOT NULL
);

CREATE TABLE wallet (
	wallet_id SERIAL PRIMARY KEY,
	currency VARCHAR(3) NOT NULL,
	amount NUMERIC,
	user_id INTEGER NOT NULL,
	created DATE NOT NULL,
	FOREIGN KEY (user_id) REFERENCES users (user_id) ON DELETE CASCADE
);


INSERT INTO users (name, surname, date_of_registration) VALUES ('Gleb', 'Ivanov', '2023-03-09');
INSERT INTO users (name, surname, date_of_registration) VALUES ('Diana', 'Vovk', '2023-03-09');

INSERT INTO wallet (currency, amount, user_id, created) VALUES ('UAH', 222, 1, '2023-03-09');
INSERT INTO wallet (currency, amount, user_id, created) VALUES ('UAH', 700, 2, '2023-03-09');

INSERT INTO wallet (currency, amount, user_id, created) VALUES ('USD', 700, 1, '2023-03-09');
INSERT INTO wallet (currency, amount, user_id, created) VALUES ('EUR', 222, 2, '2023-03-09');



SELECT users.name, wallet.currency, wallet.amount FROM users JOIN wallet ON users.user_id = wallet.user_id;
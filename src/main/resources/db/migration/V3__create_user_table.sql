CREATE TABLE TB_USERS (
                          user_id         SERIAL       NOT NULL,
                          password_hash    VARCHAR(300) NOT NULL,
                          email            VARCHAR(300) NOT NULL unique ,
                          created_at       TIMESTAMP    DEFAULT CURRENT_TIMESTAMP,
                          PRIMARY KEY (user_id)
);



CREATE TABLE TB_USER_SETTINGS (
                          user_id int primary key ,
                          daily_word_limit    int default 5,
                          native_lang    VARCHAR(100) ,
                          target_lang    VARCHAR(100) ,
                          last_limit_update timestamp default current_timestamp,
                          created_at       TIMESTAMP    DEFAULT CURRENT_TIMESTAMP,
                          constraint fk_user
                              foreign key (user_id)
                              references tb_users(user_id)
                              on delete cascade
);
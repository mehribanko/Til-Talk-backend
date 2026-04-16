CREATE TABLE TB_USER_WORD_PROGRESS (
                                       user_id           INT NOT NULL,
                                       word_id           INT NOT NULL,
                                       mastery_level     INT DEFAULT 1,
                                       consecutive_hits  INT DEFAULT 0,
                                       next_review_at    TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                       last_reviewed_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                       created_at        TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

                                       PRIMARY KEY (user_id, word_id),
                                       CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES TB_USERS(user_id) ON DELETE CASCADE,
                                       CONSTRAINT fk_word FOREIGN KEY (word_id) REFERENCES TB_WORDS(word_id) ON DELETE CASCADE
);


CREATE INDEX idx_next_review ON TB_USER_WORD_PROGRESS (next_review_at);
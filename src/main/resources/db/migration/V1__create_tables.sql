-- Category table
CREATE TABLE TB_CATEGORY (
    category_no   SERIAL      NOT NULL,
    category_name VARCHAR(50) NOT NULL,
    PRIMARY KEY (category_no)
);

-- Words table
CREATE TYPE word_level AS ENUM ('Beginner', 'Intermediate', 'Advanced');

CREATE TABLE TB_WORDS (
    word_no          SERIAL       NOT NULL,
    level            word_level   NOT NULL,
    category_no      INT          NOT NULL,
    kor_word         VARCHAR(300) NOT NULL,
    kor_romanization VARCHAR(300) NOT NULL,
    kor_audio_url    VARCHAR(500) DEFAULT NULL,
    kk_word          VARCHAR(300) NOT NULL,
    kk_romanization  VARCHAR(300) NOT NULL,
    kk_audio_url     VARCHAR(500) DEFAULT NULL,
    part_of_speech   VARCHAR(50)  NOT NULL,
    created_at       TIMESTAMP    DEFAULT CURRENT_TIMESTAMP,
    updated_at       TIMESTAMP    DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (word_no),
    FOREIGN KEY (category_no) REFERENCES TB_CATEGORY(category_no)
);

CREATE INDEX idx_words_level    ON TB_WORDS (level);
CREATE INDEX idx_words_category ON TB_WORDS (category_no);

-- Trigger to auto-update updated_at on TB_WORDS
CREATE OR REPLACE FUNCTION update_updated_at()
RETURNS TRIGGER AS $$
BEGIN
    NEW.updated_at = CURRENT_TIMESTAMP;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER trg_words_updated_at
BEFORE UPDATE ON TB_WORDS
FOR EACH ROW EXECUTE FUNCTION update_updated_at();

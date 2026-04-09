-- Seed data for TB_USERS and TB_USER_SETTINGS
-- Passwords are BCrypt-hashed. Plain-text value: "password123"

INSERT INTO TB_USERS (email, password_hash) VALUES
    ('maree@gmail.com',  '$2a$10$N9qo8uLOickgx2ZMRZoMyeIjZAgcfl7p92ldGxad68LJZdL17lhWy'),
    ('maree2@gmail.com', '$2a$10$N9qo8uLOickgx2ZMRZoMyeIjZAgcfl7p92ldGxad68LJZdL17lhWy'),
    ('maree3@gmail.com',   '$2a$10$N9qo8uLOickgx2ZMRZoMyeIjZAgcfl7p92ldGxad68LJZdL17lhWy'),
    ('maree4@gmail.com',  '$2a$10$N9qo8uLOickgx2ZMRZoMyeIjZAgcfl7p92ldGxad68LJZdL17lhWy');

INSERT INTO TB_USER_SETTINGS (user_id, daily_word_limit, native_lang, target_lang) VALUES
    (1, 5,  'Karakalpak',  'Korean'),
    (2, 10, 'Karakalpak',  'Korean'),
    (3, 5,  'Korean',  'Karakalpak'),
    (4, 15, 'Korean',  'Karakalpak');

-- Seed categories
INSERT INTO TB_CATEGORY (category_name) VALUES
    ('Food & Drink'),
    ('People & Social'),
    ('Places'),
    ('Health & Wellness'),
    ('Life & Development'),
    ('Society & Values');

-- Seed words
-- Beginner
INSERT INTO TB_WORDS (level, category_no, kor_word, kor_romanization, kk_word, kk_romanization, part_of_speech) VALUES
    ('Beginner', 1, '사과', 'sagwa',   'Alma',   'alma',   'Noun'),
    ('Beginner', 1, '우유', 'uyu',     'Sút',    'sut',    'Noun'),
    ('Beginner', 3, '학교', 'hakgyo',  'Mektep', 'mektep', 'Noun'),
    ('Beginner', 1, '물',   'mul',     'Suw',    'suw',    'Noun'),
    ('Beginner', 2, '친구', 'chingu',  'Dos',    'dos',    'Noun');

-- Intermediate
INSERT INTO TB_WORDS (level, category_no, kor_word, kor_romanization, kk_word,         kk_romanization,  part_of_speech) VALUES
    ('Intermediate', 3, '공항', 'gonghang',    'Aeroport',    'aeroport',    'Noun'),
    ('Intermediate', 4, '건강', 'geongang',    'Salamatlıq',  'salamatliq',  'Noun'),
    ('Intermediate', 5, '경험', 'gyeonghyeom', 'Tájriybe',    'tajriybe',    'Noun'),
    ('Intermediate', 5, '결정', 'gyeoljeong',  'Qarar',       'qarar',       'Noun'),
    ('Intermediate', 5, '성공', 'seonggong',   'Tabıs',       'tabis',       'Noun');

-- Advanced
INSERT INTO TB_WORDS (level, category_no, kor_word, kor_romanization, kk_word,            kk_romanization,  part_of_speech) VALUES
    ('Advanced', 6, '환경', 'hwangyeong',  'Atrap-ortalıq', 'atrap-ortaliq', 'Noun'),
    ('Advanced', 6, '독립', 'dongnip',     'Ǵárezsizlik',   'garezsizlik',   'Noun'),
    ('Advanced', 6, '평등', 'pyeongdeung', 'Teńlik',        'tenlik',        'Noun'),
    ('Advanced', 6, '경제', 'gyeongje',    'Ekonomika',     'ekonomika',     'Noun'),
    ('Advanced', 6, '정의', 'jeongui',     'Ádalat',        'adalat',        'Noun');

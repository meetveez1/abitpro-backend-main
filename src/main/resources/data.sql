INSERT INTO users (id, full_name, email, password_hash, city, exam_score, created_at)
SELECT * FROM (VALUES
    (1, 'Иван Петров', 'ivan@mail.com', 'password123', 'Москва', 285, '2026-01-01'::date),
    (2, 'Мария Сидорова', 'maria@mail.com', 'password123', 'Санкт-Петербург', 275, '2026-01-02'::date),
    (3, 'Алексей Смирнов', 'alex@mail.com', 'password123', 'Новосибирск', 290, '2026-01-03'::date)
) AS vals(id, full_name, email, password_hash, city, exam_score, created_at)
WHERE NOT EXISTS (SELECT 1 FROM users);

INSERT INTO universities (id, name, city, description, official_website, rating, is_military, military_from_course)
SELECT * FROM (VALUES
    (1, 'МГУ им. М.В. Ломоносова', 'Москва', 'Ведущий классический университет России', 'https://msu.ru', 98, true, 2),
    (2, 'СПбГУ', 'Санкт-Петербург', 'Старейший университет России', 'https://spbu.ru', 95, true, 2),
    (3, 'НИУ ВШЭ', 'Москва', 'Современный экономический университет', 'https://hse.ru', 94, false, 0),
    (4, 'МФТИ', 'Долгопрудный', 'Физтех', 'https://mipt.ru', 97, true, 3),
    (5, 'НГУ', 'Новосибирск', 'Университет в Академгородке', 'https://nsu.ru', 92, true, 2),
    (6, 'МГТУ им. Баумана', 'Москва', 'Технический университет', 'https://bmstu.ru', 96, true, 1),
    (7, 'МИФИ', 'Москва', 'Ядерный университет', 'https://mephi.ru', 91, true, 2),
    (8, 'РУДН', 'Москва', 'Университет дружбы народов', 'https://rudn.ru', 88, false, 0),
    (9, 'КФУ', 'Казань', 'Казанский федеральный университет', 'https://kpfu.ru', 87, true, 2),
    (10, 'ТГУ', 'Томск', 'Томский государственный университет', 'https://tsu.ru', 89, true, 2),
    (11, 'УрФУ', 'Екатеринбург', 'Уральский федеральный университет', 'https://urfu.ru', 86, true, 2),
    (12, 'ИТМО', 'Санкт-Петербург', 'Университет ИТ', 'https://itmo.ru', 93, false, 0)
) AS vals(id, name, city, description, official_website, rating, is_military, military_from_course)
WHERE NOT EXISTS (SELECT 1 FROM universities);

INSERT INTO programs (university_id, name, code, education_form, budget_places, passing_budget_score, paid_places, passing_paid_score, cost_of_education)
SELECT * FROM (VALUES
    (1, 'Прикладная математика', '01.03.02', 'Очная', 100, 285, 50, 265, 350000),
    (1, 'Физика', '03.03.02', 'Очная', 80, 278, 40, 255, 340000),
    (1, 'Химия', '04.03.01', 'Очная', 70, 265, 45, 240, 330000),
    (2, 'Программная инженерия', '09.03.04', 'Очная', 85, 280, 55, 260, 360000),
    (2, 'Прикладная математика', '01.03.02', 'Очная', 75, 275, 45, 255, 350000),
    (3, 'Бизнес-информатика', '38.03.05', 'Очная', 70, 282, 100, 260, 450000),
    (3, 'Программная инженерия', '09.03.04', 'Очная', 65, 288, 90, 268, 460000),
    (4, 'Прикладная математика', '01.03.02', 'Очная', 60, 295, 30, 275, 300000),
    (4, 'Информатика', '09.03.01', 'Очная', 55, 292, 35, 272, 290000),
    (5, 'Фундаментальная информатика', '02.03.02', 'Очная', 60, 275, 30, 255, 280000),
    (6, 'Информатика', '09.03.01', 'Очная', 80, 285, 60, 265, 320000),
    (6, 'Робототехника', '15.03.06', 'Очная', 50, 282, 40, 262, 330000),
    (7, 'Ядерная физика', '03.03.02', 'Очная', 50, 280, 30, 260, 300000),
    (8, 'Международные отношения', '41.03.05', 'Очная', 40, 270, 60, 248, 420000),
    (9, 'Математика', '01.03.01', 'Очная', 55, 268, 30, 248, 250000),
    (10, 'Информатика', '02.03.02', 'Очная', 60, 272, 35, 252, 270000),
    (11, 'Программная инженерия', '09.03.04', 'Очная', 65, 270, 45, 250, 280000),
    (12, 'Информационные системы', '09.03.02', 'Очная', 55, 278, 40, 258, 350000)
) AS vals(university_id, name, code, education_form, budget_places, passing_budget_score, paid_places, passing_paid_score, cost_of_education)
WHERE NOT EXISTS (SELECT 1 FROM programs);

INSERT INTO favorite_university (user_id, university_id, added_at)
SELECT * FROM (VALUES
    (1, 1, '2026-04-01'::date),
    (1, 3, '2026-04-02'::date),
    (1, 5, '2026-04-03'::date),
    (2, 2, '2026-04-01'::date),
    (2, 4, '2026-04-02'::date),
    (3, 1, '2026-04-01'::date),
    (3, 6, '2026-04-01'::date),
    (3, 8, '2026-04-02'::date)
) AS vals(user_id, university_id, added_at)
WHERE NOT EXISTS (SELECT 1 FROM favorite_university);

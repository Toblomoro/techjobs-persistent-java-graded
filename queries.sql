-- Part 1: Test it with SQL
 --I inserted a job just to be sure
 -- Columns: id: INT, employer: VARCHAR, name: VARCHAR, skills VARCHAR


-- Part 2: Test it with SQL
SELECT name FROM employer WHERE location = "St. Louis City";
-- Part 3: Test it with SQL

DROP TABLE job;

-- Part 4: Test it with SQL
SELECT * FROM skill
INNER JOIN job_skills ON job_skills.skills_id = skill_id
WHERE job_skills.jobs_id IS NOT NULL
ORDER BY name ASC;
SELECT
    question_id,
    question_type,
    question_content
FROM
    question
WHERE
    questionnaire_id = /*questionnaireId*/1
ORDER BY
    sort_no ASC
;
SELECT
    question_detail_id,
    ifnull(question_detail_content, '') as question_detail_content
FROM
    question_detail
WHERE
    question_id = /*questionId*/1
ORDER BY
    sort_no ASC
;
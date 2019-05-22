SELECT
    question_detail_id,
    ifnull(question_detail_content, '') as question_detail_content,
    question_id
FROM
    question_detail
WHERE
    question_id in /*questionIds*/(1)
ORDER BY
    sort_no ASC
;
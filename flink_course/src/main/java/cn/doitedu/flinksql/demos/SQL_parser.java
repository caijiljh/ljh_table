package cn.doitedu.flinksql.demos;

public class SQL_parser {


//
//    {
//        "funcName": "test",
//            "data": {
//        "snapshots": [{
//            "content_type": "application/x-gzip-compressed-jpeg",
//                    "url": "https://blog.csdn.net/xianpanjia4616"
//        }],
//        "audio": [{
//            "content_type": "audio/wav",
//                    "url": " https://bss.csdn.net/m/topic/blog_star2020/detail?username=xianpanjia4616"
//        }]
//    },
//        "resultMap": {
//        "result": {
//            "cover": "/data/test/log.txt"
//        },
//        "isSuccess": true
//    },
//        "meta": {
//        "video_type": "normal"
//    },
//        "type": 2,
//            "timestamp": 1610549997263,
//            "arr": [{
//        "address": "北京市海淀区",
//                "city": "beijing"
//    }, {
//        "address": "北京市海淀区",
//                "city": "beijing"
//    }, {
//        "address": "北京市海淀区",
//                "city": "beijing"
//    }],
//        "map": {
//        "flink": 456
//    },
//        "doublemap": {
//        "inner_map": {
//            "key": 123
//        }
//    }
//    }



//    CREATE TABLE kafka_source (
//            funcName STRING,
//            data ROW<snapshots ARRAY<ROW<content_type STRING,url STRING>>,audio ARRAY<ROW<content_type STRING,url STRING>>>,
//            resultMap ROW<`result` MAP<STRING,STRING>,isSuccess BOOLEAN>,
//            meta  MAP<STRING,STRING>,
//    `type` INT,
//    `timestamp` BIGINT,
//            arr ARRAY<ROW<address STRING,city STRING>>,
//            map MAP<STRING,INT>,
//            doublemap MAP<STRING,MAP<STRING,INT>>,
//            proctime as PROCTIME()
//) WITH (
//    'connector' = 'kafka', -- 使用 kafka connector
//            'topic' = 'test',  -- kafka topic
//    'properties.bootstrap.servers' = 'master:9092,storm1:9092,storm2:9092',  -- broker连接信息
//    'properties.group.id' = 'jason_flink_test', -- 消费kafka的group_id
//    'scan.startup.mode' = 'latest-offset',  -- 读取数据的位置
//    'format' = 'json',  -- 数据源格式为 json
//    'json.fail-on-missing-field' = 'true', -- 字段丢失任务不失败
//    'json.ignore-parse-errors' = 'false'  -- 解析失败跳过
//    )





//    select
//            funcName,
//    doublemap['inner_map']['key'],
//    count(data.snapshots[1].url),
//`type`,
//    TUMBLE_START(proctime, INTERVAL '30' second) as t_start
//    from kafka_source
//    group by TUMBLE(proctime, INTERVAL '30' second),funcName,`type`,doublemap['inner_map']['key']


}

package com.kafka;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    String hello() {
        return """
                :ok
                
                event: message
                id: [{"topic":"eqiad.mediawiki.recentchange","partition":0,"timestamp":1756449917002},{"topic":"codfw.mediawiki.recentchange","partition":0,"offset":-1}]
                data: {"$schema":"/mediawiki/recentchange/1.0.0","meta":{"uri":"https://mg.wiktionary.org/wiki/Sokajy:espaniola","request_id":"5ecafc8f-2a80-413b-a397-b497e9b7cc51","id":"b03928dd-fdda-411c-94a1-63977d990b31","domain":"mg.wiktionary.org","stream":"mediawiki.recentchange","dt":"2025-08-29T06:45:17.001Z","topic":"eqiad.mediawiki.recentchange","partition":0,"offset":5891112553},"id":68147964,"type":"categorize","namespace":14,"title":"Sokajy:espaniola","title_url":"https://mg.wiktionary.org/wiki/Sokajy:espaniola","comment":"Nampiana tamin'ny sokajy [[:erradiquémosles]]","timestamp":1756449915,"user":"Ikotobaity","bot":true,"notify_url":"https://mg.wiktionary.org/w/index.php?diff=36040296&oldid=0","server_url":"https://mg.wiktionary.org","server_name":"mg.wiktionary.org","server_script_path":"/w","wiki":"mgwiktionary","parsedcomment":"Nampiana tamin&#039;ny sokajy <a href=\\"/wiki/erradiqu%C3%A9mosles\\" title=\\"erradiquémosles\\">erradiquémosles</a>"}
                
                event: message
                id: [{"topic":"eqiad.mediawiki.recentchange","partition":0,"timestamp":1756449916994},{"topic":"codfw.mediawiki.recentchange","partition":0,"offset":-1}]
                data: {"$schema":"/mediawiki/recentchange/1.0.0","meta":{"uri":"https://commons.wikimedia.org/wiki/File:Fallen_giant_-_geograph.org.uk_-_1676905.jpg","request_id":"96a51493-58fc-4c79-aca6-150db6d5d3bd","id":"278ef1da-e471-4142-907d-0fb2cb89fb7f","domain":"commons.wikimedia.org","stream":"mediawiki.recentchange","dt":"2025-08-29T06:45:16.993Z","topic":"eqiad.mediawiki.recentchange","partition":0,"offset":5891112554},"id":2996209323,"type":"edit","namespace":6,"title":"File:Fallen giant - geograph.org.uk - 1676905.jpg","title_url":"https://commons.wikimedia.org/wiki/File:Fallen_giant_-_geograph.org.uk_-_1676905.jpg","comment":"/* wbeditentity-update-languages-and-other-short:0||en */ Adding structured data to this newly uploaded geograph.org.uk image","timestamp":1756449916,"user":"GeographBot","bot":true,"notify_url":"https://commons.wikimedia.org/w/index.php?diff=1078664500&oldid=1078664490&rcid=2996209323","minor":false,"patrolled":true,"length":{"old":71,"new":8478},"revision":{"old":1078664490,"new":1078664500},"server_url":"https://commons.wikimedia.org","server_name":"commons.wikimedia.org","server_script_path":"/w","wiki":"commonswiki","parsedcomment":"‎<span dir=\\"auto\\"><span class=\\"autocomment\\">Changed label, description and/or aliases in en, and other parts: </span></span> Adding structured data to this newly uploaded geograph.org.uk image"}
                
                event: message
                id: [{"topic":"eqiad.mediawiki.recentchange","partition":0,"timestamp":1756449917036},{"topic":"codfw.mediawiki.recentchange","partition":0,"offset":-1}]
                data: {"$schema":"/mediawiki/recentchange/1.0.0","meta":{"uri":"https://es.wikipedia.org/wiki/Anexo:Pel%C3%ADculas_de_Walt_Disney_Pictures","request_id":"9e671ba3-28d9-4b29-87b3-49966666a491","id":"4625d6f5-f402-48c5-aeff-37189cc25d0b","domain":"es.wikipedia.org","stream":"mediawiki.recentchange","dt":"2025-08-29T06:45:17.035Z","topic":"eqiad.mediawiki.recentchange","partition":0,"offset":5891112555},"id":336406451,"type":"edit","namespace":104,"title":"Anexo:Películas de Walt Disney Pictures","title_url":"https://es.wikipedia.org/wiki/Anexo:Pel%C3%ADculas_de_Walt_Disney_Pictures","comment":"","timestamp":1756449914,"user":"BrookTheHumming","bot":false,"notify_url":"https://es.wikipedia.org/w/index.php?diff=169228781&oldid=169223990","minor":false,"length":{"old":83624,"new":83535},"revision":{"old":169223990,"new":169228781},"server_url":"https://es.wikipedia.org","server_name":"es.wikipedia.org","server_script_path":"/w","wiki":"eswiki","parsedcomment":""}
                
                event: message
                id: [{"topic":"eqiad.mediawiki.recentchange","partition":0,"timestamp":1756449917039},{"topic":"codfw.mediawiki.recentchange","partition":0,"offset":-1}]
                data: {"$schema":"/mediawiki/recentchange/1.0.0","meta":{"uri":"https://ro.wikipedia.org/wiki/Categorie:Localit%C4%83%C8%9Bi_cu_denumiri_schimbate","request_id":"cbd7ccde-d237-4451-90aa-a2c70e738608","id":"46b9191c-e0c4-44d7-8099-d76378e57a93","domain":"ro.wikipedia.org","stream":"mediawiki.recentchange","dt":"2025-08-29T06:45:17.038Z","topic":"eqiad.mediawiki.recentchange","partition":0,"offset":5891112556},"id":144591060,"type":"categorize","namespace":14,"title":"Categorie:Localități cu denumiri schimbate","title_url":"https://ro.wikipedia.org/wiki/Categorie:Localit%C4%83%C8%9Bi_cu_denumiri_schimbate","comment":"[[:Châlons-en-Champagne]] a fost adăugată în categorii","timestamp":1756449909,"user":"Lucian GAVRILA","bot":false,"notify_url":"https://ro.wikipedia.org/w/index.php?diff=17149129&oldid=17149126&rcid=144591060","server_url":"https://ro.wikipedia.org","server_name":"ro.wikipedia.org","server_script_path":"/w","wiki":"rowiki","parsedcomment":"<a href=\\"/wiki/Ch%C3%A2lons-en-Champagne\\" title=\\"Châlons-en-Champagne\\">Châlons-en-Champagne</a> a fost adăugată în categorii"}
                
                event: message
                id: [{"topic":"eqiad.mediawiki.recentchange","partition":0,"timestamp":1756449917053},{"topic":"codfw.mediawiki.recentchange","partition":0,"offset":-1}]
                data: {"$schema":"/mediawiki/recentchange/1.0.0","meta":{"uri":"https://mg.wiktionary.org/wiki/Sokajy:Endriky_ny_matoanteny_amin%27ny_teny_espaniola","request_id":"5ecafc8f-2a80-413b-a397-b497e9b7cc51","id":"2e415a28-c998-4238-86b8-6dcb8b45216f","domain":"mg.wiktionary.org","stream":"mediawiki.recentchange","dt":"2025-08-29T06:45:17.052Z","topic":"eqiad.mediawiki.recentchange","partition":0,"offset":5891112557},"id":68147965,"type":"categorize","namespace":14,"title":"Sokajy:Endriky ny matoanteny amin'ny teny espaniola","title_url":"https://mg.wiktionary.org/wiki/Sokajy:Endriky_ny_matoanteny_amin%27ny_teny_espaniola","comment":"Nampiana tamin'ny sokajy [[:erradiquémosles]]","timestamp":1756449915,"user":"Ikotobaity","bot":true,"notify_url":"https://mg.wiktionary.org/w/index.php?diff=36040296&oldid=0","server_url":"https://mg.wiktionary.org","server_name":"mg.wiktionary.org","server_script_path":"/w","wiki":"mgwiktionary","parsedcomment":"Nampiana tamin&#039;ny sokajy <a href=\\"/wiki/erradiqu%C3%A9mosles\\" title=\\"erradiquémosles\\">erradiquémosles</a>"}
                
                event: message
                id: [{"topic":"eqiad.mediawiki.recentchange","partition":0,"timestamp":1756449917107},{"topic":"codfw.mediawiki.recentchange","partition":0,"offset":-1}]
                data: {"$schema":"/mediawiki/recentchange/1.0.0","meta":{"uri":"https://commons.wikimedia.org/wiki/File:Bradstone_Road_-_geograph.org.uk_-_3680415.jpg","request_id":"07b44a4f-2e3b-47ea-843c-f9890594a5bb","id":"088d24d3-2117-4f70-b633-eff39a4b613f","domain":"commons.wikimedia.org","stream":"mediawiki.recentchange","dt":"2025-08-29T06:45:17.106Z","topic":"eqiad.mediawiki.recentchange","partition":0,"offset":5891112558},"id":2996209324,"type":"edit","namespace":6,"title":"File:Bradstone Road - geograph.org.uk - 3680415.jpg","title_url":"https://commons.wikimedia.org/wiki/File:Bradstone_Road_-_geograph.org.uk_-_3680415.jpg","comment":"added [[Category:Former Salvation Army buildings in the United Kingdom]]","timestamp":1756449915,"user":"Mjroots","bot":false,"notify_url":"https://commons.wikimedia.org/w/index.php?diff=1078664497&oldid=1078664445&rcid=2996209324","minor":true,"patrolled":true,"length":{"old":13007,"new":13074},"revision":{"old":1078664445,"new":1078664497},"server_url":"https://commons.wikimedia.org","server_name":"commons.wikimedia.org","server_script_path":"/w","wiki":"commonswiki","parsedcomment":"added <a href=\\"/wiki/Category:Former_Salvation_Army_buildings_in_the_United_Kingdom\\" title=\\"Category:Former Salvation Army buildings in the United Kingdom\\">Category:Former Salvation Army buildings in the United Kingdom</a>"}
                
                event: message
                id: [{"topic":"eqiad.mediawiki.recentchange","partition":0,"timestamp":1756449917116},{"topic":"codfw.mediawiki.recentchange","partition":0,"offset":-1}]
                data: {"$schema":"/mediawiki/recentchange/1.0.0","meta":{"uri":"https://mg.wiktionary.org/wiki/Sokajy:Pejy_avy_any_amin%27ny_wikibolana_anglisy","request_id":"5ecafc8f-2a80-413b-a397-b497e9b7cc51","id":"d86d052c-6dd3-4676-b1ea-4d95f8304201","domain":"mg.wiktionary.org","stream":"mediawiki.recentchange","dt":"2025-08-29T06:45:17.115Z","topic":"eqiad.mediawiki.recentchange","partition":0,"offset":5891112559},"id":68147966,"type":"categorize","namespace":14,"title":"Sokajy:Pejy avy any amin'ny wikibolana anglisy","title_url":"https://mg.wiktionary.org/wiki/Sokajy:Pejy_avy_any_amin%27ny_wikibolana_anglisy","comment":"Nampiana tamin'ny sokajy [[:erradiquémosles]]","timestamp":1756449915,"user":"Ikotobaity","bot":true,"notify_url":"https://mg.wiktionary.org/w/index.php?diff=36040296&oldid=0","server_url":"https://mg.wiktionary.org","server_name":"mg.wiktionary.org","server_script_path":"/w","wiki":"mgwiktionary","parsedcomment":"Nampiana tamin&#039;ny sokajy <a href=\\"/wiki/erradiqu%C3%A9mosles\\" title=\\"erradiquémosles\\">erradiquémosles</a>"}
                
                event: message
                id: [{"topic":"eqiad.mediawiki.recentchange","partition":0,"timestamp":1756449917225},{"topic":"codfw.mediawiki.recentchange","partition":0,"offset":-1}]
                data: {"$schema":"/mediawiki/recentchange/1.0.0","meta":{"uri":"https://commons.wikimedia.org/wiki/User:S._D%C3%89NIEL/Photographies_et_dessins","request_id":"a647420d-f977-46c9-9481-3f542b1d1d1f","id":"7213d21c-67ee-4bc1-b1b2-e2539f15c974","domain":"commons.wikimedia.org","stream":"mediawiki.recentchange","dt":"2025-08-29T06:45:17.224Z","topic":"eqiad.mediawiki.recentchange","partition":0,"offset":5891112560},"id":2996209325,"type":"edit","namespace":2,"title":"User:S. DÉNIEL/Photographies et dessins","title_url":"https://commons.wikimedia.org/wiki/User:S._D%C3%89NIEL/Photographies_et_dessins","comment":"/* Rephotographie */","timestamp":1756449915,"user":"S. DÉNIEL","bot":false,"notify_url":"https://commons.wikimedia.org/w/index.php?diff=1078664496&oldid=1078662645&rcid=2996209325","minor":false,"patrolled":true,"length":{"old":8678,"new":8785},"revision":{"old":1078662645,"new":1078664496},"server_url":"https://commons.wikimedia.org","server_name":"commons.wikimedia.org","server_script_path":"/w","wiki":"commonswiki","parsedcomment":"<span class=\\"autocomment\\"><a href=\\"/wiki/User:S._D%C3%89NIEL/Photographies_et_dessins#Rephotographie\\" title=\\"User:S. DÉNIEL/Photographies et dessins\\">→<bdi dir=\\"ltr\\">Rephotographie</bdi></a></span>"}
                
                event: message
                id: [{"topic":"eqiad.mediawiki.recentchange","partition":0,"timestamp":1756449917281},{"topic":"codfw.mediawiki.recentchange","partition":0,"offset":-1}]
                data: {"$schema":"/mediawiki/recentchange/1.0.0","meta":{"uri":"https://mg.wiktionary.org/wiki/arponeaban","request_id":"d335556e-7300-4f5a-af39-c68c347a689e","id":"609031e2-4658-4227-a668-0e6dacbe7543","domain":"mg.wiktionary.org","stream":"mediawiki.recentchange","dt":"2025-08-29T06:45:17.280Z","topic":"eqiad.mediawiki.recentchange","partition":0,"offset":5891112561},"id":68147967,"type":"new","namespace":0,"title":"arponeaban","title_url":"https://mg.wiktionary.org/wiki/arponeaban","comment":"Dikanteny: es","timestamp":1756449916,"user":"Ikotobaity","bot":true,"notify_url":"https://mg.wiktionary.org/w/index.php?oldid=36040297&rcid=68147967","minor":false,"patrolled":true,"length":{"new":181},"revision":{"new":36040297},"server_url":"https://mg.wiktionary.org","server_name":"mg.wiktionary.org","server_script_path":"/w","wiki":"mgwiktionary","parsedcomment":"Dikanteny: es"}
                
                """;
    }

//    @Data
//    static class Result {
//        private final int left;
//        private final int right;
//        private final long answer;
//    }

    // SQL sample
  /*  @RequestMapping("calc")
    Result calc(@RequestParam int left, @RequestParam int right) {
        MapSqlParameterSource source = new MapSqlParameterSource()
                .addValue("left", left)
                .addValue("right", right);
        return jdbcTemplate.queryForObject("SELECT :left + :right AS answer", source,
                (rs, rowNum) -> new Result(left, right, rs.getLong("answer")));
    }*/
}

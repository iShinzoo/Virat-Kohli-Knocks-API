package com.ktorsample.route

import com.ktorsample.data.model.Image
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


private const val BASE_URL = "http://192.168.43.91:8100"

private val image = listOf(
    Image(
        "2012 Champions Trophy",
        "Virat Kohli scored a match-winning 103 not out to lead India to victory in the final against Pakistan.",
        "$BASE_URL/images/v1.jpg"
    ), Image(
        "82* vs Pakistan, ICC T20 World Cup (2022)",
        "One of the best T20I and cricket knocks hands down. Kohli was on the crease with India at 31/4 in a run-chase of 160. He stayed till the end and made a century partnership with Hardik Pandya, scoring 82* in 53 balls with six fours and four sixes. India won a thriller at the MCG. Kohli's sixes to Haris Rauf in the 19th over and the commentary following it will forever stay alive in fan's minds.",
        "$BASE_URL/images/v2.jpg"
    ), Image(
        "160* vs South Africa, 3rd ODI (2018)",
        "In the third ODI at Cape Town, Kohli played one of his finest ODI knocks, scoring 160* in 159 balls with 12 fours and two sixes, scoring the other hundred runs with his ever-supreme running between the wickets. India won the match by 124 runs defending 304 runs and the series as well.  ",
        "$BASE_URL/images/v3.jpg"
    ), Image(
        "100* vs Australia, 2nd ODI (2013)",
        "Chasing a target of 360, Virat along with Rohit looted the Australian bowlers of these runs and self-respect as they were mercilessly thrashed all over the park at Jaipur. Kohli smashed the fastest ODI ton by an Indian in just 52 balls, with eight fours and seven sixes as India chased down the total in 43.3 overs with nine wickets to go. ",
        "$BASE_URL/images/v4.jpg"
    ), Image(
        "183 vs Pakistan, Asia Cup 2012",
        "Chasing 330 against arch-rivals Pakistan, Virat made a mockery of Umar Gul, peak Saeed Ajmal, Shahid Afridi and Wahab Riaz to smash 183 in just 148 balls with 22 fours and a six to seal India a six-wicket win with 13 balls to go. ",
        "$BASE_URL/images/v5.jpg"
    )
)

fun Route.randomImage() {
    get("/randomImage") {
        call.respond(
            HttpStatusCode.OK,
            image.random()
        )
    }
}
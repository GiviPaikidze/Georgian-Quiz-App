package com.example.georgianquizapp

object setData {

    const val name:String="name"
    const val score:String="score"

   fun getQuestion():ArrayList<QuestionData>{
       var que:ArrayList<QuestionData> = arrayListOf()

       var question1 = QuestionData(
           1,
           "რომელია ყველაზე ლამაზი ქალაქი ?",

           "ვანი",
           "თბილისი",
           "ქუთაისი",
           "ბათუმი",
           1
       )
       var question2 = QuestionData(
           2,
           "ვინ დაარსა თბილისი ?",

           "კოსტია გამსახურდია  ",
           "ვახტანგ გორგასალი",
           "შოთა რუსთაველი",
           "სოლომონ ჩოლოყაშვილი",
           2
       )
       var question3 = QuestionData(
           3,
           "რომელია საქართველოს პირველი პრეზიდენტი ?",

           "ზვიად გამსახურდია",
           "მიშა სააკაშვილი",
           "ედუარდ შევარდნაძე",
           "გიორგი მარგველაშვილი",
           1
       )
       var question4 = QuestionData(
           4,
           "ვინ იყო მსოფლიოს პირველი კაცი ჩემპიონი ჭადრაკში?",

           "ვილჰელმ შტაინიცი",
           "ცოტნე ღვინიაშვილი",
           "გარი კასპაროვი",
           "მაგნუს კარლსენი",
           1
       )

       var question5 = QuestionData(
           5,
           "რამდენს დაუწერს ქეთი - გივი,გოგა და ცოტნეს ?",

           "0",
           "21",
           "19",
           "40",
           4
       )
// shegvidzlia davamatot kide Shekitxvebi
       que.add(question1)
       que.add(question2)
       que.add(question3)
       que.add(question4)
       que.add(question5)
       return que
   }
}
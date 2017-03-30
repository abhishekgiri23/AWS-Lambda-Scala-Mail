package com.knoldus

/**
  * Created by abhishek on 30/3/17.
  */
object Email extends EmailNotification with App{
  val em = new EmailNotification
  em.sendEmail("abc@gmail.com","xyz@hotmail.com",
    "email notification demo","hi this a is demo for email notification")
}

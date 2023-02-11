package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

private var counter = 0
private var scoreOne = 0
private var scoreTwo = 0
private var progress1 = 0
private var progress2 = 0
private var visiting : IntArray = intArrayOf(1,1,1,1,1,1,1,1,1)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Button 1
        button1.setOnClickListener {
            if(visiting[0]==1){
                if(counter%2==0)    button1.text="X"
                else    button1.text="O"
                counter++
                visiting[0]=0
                win()
            }
        }

        // Button 2
        button2.setOnClickListener {
            if(visiting[1]==1){
                if(counter%2==0)    button2.text="X"
                else    button2.text="O"
                counter++
                visiting[1]=0
                win()
            }
        }

        // Button 3
        button3.setOnClickListener {
            if(visiting[2]==1){
                if(counter%2==0)    button3.text="X"
                else    button3.text="O"
                counter++
                visiting[2]=0
                win()
            }
        }

        //Button 4
        button4.setOnClickListener {
            if(visiting[3]==1){
                if(counter%2==0)    button4.text="X"
                else    button4.text="O"
                counter++
                visiting[3]=0
                win()
            }
        }

        // Button 5
        button5.setOnClickListener {
            if(visiting[4]==1){
                if(counter%2==0)    button5.text="X"
                else    button5.text="O"
                counter++
                visiting[4]=0
                win()
            }
        }

        //Button 6
        button6.setOnClickListener {
            if(visiting[5]==1){
                if(counter%2==0)    button6.text="X"
                else    button6.text="O"
                counter++
                visiting[5]=0
                win()
            }
        }

        // Button 7
        button7.setOnClickListener {
            if(visiting[6]==1){
                if(counter%2==0)    button7.text="X"
                else    button7.text="O"
                counter++
                visiting[6]=0
                win()
            }
        }

        // Button 8
        button8.setOnClickListener {
            if(visiting[7]==1){
                if(counter%2==0)    button8.text="X"
                else    button8.text="O"
                counter++
                visiting[7]=0
                win()
            }
        }

        //Button 9
        button9.setOnClickListener {
            if (visiting[8]==1){
                if(counter%2==0)    button9.text="X"
                else    button9.text="O"
                counter++
                visiting[8]=0
                win()
            }
        }

        // Restart Button
        restart.setOnClickListener {reset()}
    }

    // Function to reset
     private fun reset(){
        button9.text=""
        button8.text=""
        button7.text=""
        button6.text=""
        button5.text=""
        button4.text=""
        button3.text=""
        button2.text=""
        button1.text=""
        visiting = intArrayOf(1,1,1,1,1,1,1,1,1)
    }

    // Function to check win
    private fun win(){

        // For 1,2,3
        if(button1.text.toString()==button2.text.toString() && button1.text.toString() == button3.text.toString() && button1.text.toString()!=""){
            if(button1.text.toString()=="X"){
                scoreOne++
                Toast.makeText(this,"Player 1 WIN!", Toast.LENGTH_SHORT).show()
                score1.text= scoreOne.toString()
                progress1++
            }
            else{
                scoreTwo++
                Toast.makeText(this,"Player 2 WIN!", Toast.LENGTH_SHORT).show()
                score2.text= scoreTwo.toString()
                progress2++
            }
            Thread.sleep(1000)
            progress()
            reset()
        }

        // For 1,4,7
        else if(button1.text.toString()==button4.text.toString() && button1.text.toString() == button7.text.toString() && button1.text.toString()!=""){
            if(button1.text.toString()=="X"){
                scoreOne++
                Toast.makeText(this,"Player 1 WIN!", Toast.LENGTH_SHORT).show()
                score1.text= scoreOne.toString()
                progress1++
            }
            else{
                scoreTwo++
                Toast.makeText(this,"Player 2 WIN!", Toast.LENGTH_SHORT).show()
                score2.text= scoreTwo.toString()
                progress2++
            }
            Thread.sleep(1000)
            progress()
            reset()
        }

        // For 1,5,9
        else if(button1.text.toString()==button5.text.toString() && button1.text.toString() == button9.text.toString() && button1.text.toString()!=""){
            if(button1.text.toString()=="X"){
                scoreOne++
                Toast.makeText(this,"Player 1 WIN!", Toast.LENGTH_SHORT).show()
                score1.text= scoreOne.toString()
                progress1++
            }
            else{
                scoreTwo++
                Toast.makeText(this,"Player 2 WIN!", Toast.LENGTH_SHORT).show()
                score2.text= scoreTwo.toString()
                progress2++
            }
            Thread.sleep(1000)
            progress()
            reset()
        }

        // For 3,6,9
        else if(button3.text.toString()==button6.text.toString() && button3.text.toString() == button9.text.toString() && button3.text.toString()!=""){
            if(button3.text.toString()=="X"){
                scoreOne++
                Toast.makeText(this,"Player 1 WIN!", Toast.LENGTH_SHORT).show()
                score1.text= scoreOne.toString()
                progress1++
            }
            else{
                scoreTwo++
                Toast.makeText(this,"Player 2 WIN!", Toast.LENGTH_SHORT).show()
                score2.text= scoreTwo.toString()
                progress2++
            }
            Thread.sleep(1000)
            progress()
            reset()
        }

        // For 3,5,7
        else if(button3.text.toString()==button5.text.toString() && button3.text.toString() == button7.text.toString() && button3.text.toString()!=""){
            if(button3.text.toString()=="X"){
                scoreOne++
                Toast.makeText(this,"Player 1 WIN!", Toast.LENGTH_SHORT).show()
                score1.text= scoreOne.toString()
                progress1++
            }
            else{
                scoreTwo++
                Toast.makeText(this,"Player 2 WIN!", Toast.LENGTH_SHORT).show()
                score2.text= scoreTwo.toString()
                progress2++
            }
            Thread.sleep(1000)
            progress()
            reset()
        }

        // For 4,5,6
        else if(button4.text.toString()==button5.text.toString() && button4.text.toString() == button6.text.toString() && button4.text.toString()!=""){
            if(button4.text.toString()=="X"){
                scoreOne++
                Toast.makeText(this,"Player 1 WIN!", Toast.LENGTH_SHORT).show()
                score1.text= scoreOne.toString()
                progress1++
            }
            else{
                scoreTwo++
                Toast.makeText(this,"Player 2 WIN!", Toast.LENGTH_SHORT).show()
                score2.text= scoreTwo.toString()
                progress2++
            }
            Thread.sleep(1000)
            progress()
            reset()
        }

        // For 7,8,9
        else if(button7.text.toString()==button8.text.toString() && button7.text.toString() == button9.text.toString() && button7.text.toString()!=""){
            if(button7.text.toString()=="X"){
                scoreOne++
                Toast.makeText(this,"Player 1 WIN!", Toast.LENGTH_SHORT).show()
                score1.text= scoreOne.toString()
                progress1++
            }
            else{
                scoreTwo++
                Toast.makeText(this,"Player 2 WIN!", Toast.LENGTH_SHORT).show()
                score2.text= scoreTwo.toString()
                progress2++
            }
            Thread.sleep(1000)
            progress()
            reset()
        }

        // For 2,5,8
        else if(button2.text.toString()==button5.text.toString() && button2.text.toString() == button8.text.toString() && button2.text.toString()!=""){
            if(button2.text.toString()=="X"){
                scoreOne++
                Toast.makeText(this,"Player 1 WIN!", Toast.LENGTH_SHORT).show()
                score1.text= scoreOne.toString()
                progress1++
            }
            else{
                scoreTwo++
                Toast.makeText(this,"Player 2 WIN!", Toast.LENGTH_SHORT).show()
                score2.text= scoreTwo.toString()
                progress2++
            }
            Thread.sleep(1000)
            progress()
            reset()
        }
    }

    // Progress Bar
    private fun progress(){
        progressBar1.progress = 20 * progress1
        progressBar2.progress = 20 * progress2

        if(progress1==5 || progress2==5){
            if(progress1==5)    Toast.makeText(this,"Player 1 Won the Series!!!",Toast.LENGTH_LONG).show()
            else   Toast.makeText(this,"Player 2 Won the Series!!!",Toast.LENGTH_LONG).show()

            counter = 0
            scoreOne = 0
            scoreTwo = 0
            progress1 = 0
            progress2 = 0
            Thread.sleep(2000)
            score1.text= scoreOne.toString()
            score2.text= scoreTwo.toString()
            progressBar1.progress = 0
            progressBar2.progress = 0
            reset()
        }
    }
}
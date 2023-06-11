using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Obstacle : MonoBehaviour
{
    // Start is called before the first frame update
    private int speed = 3;
    public GameObject bird = GameObject.Find("Bird");

    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        transform.Translate (Vector2.left * speed * Time.deltaTime);

        //if at x=-5, go to x=17 to continue the loop
        if(transform.position.x < -5){
           transform.position = new Vector2(17, transform.position.y);
        }
           
        if(bird.transform.position.x == -0.5){
            
        }

    }
}

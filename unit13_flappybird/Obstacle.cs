using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Obstacle : MonoBehaviour
{
    // Start is called before the first frame update
    private int speed = 3;
    //private int destroyPoint = -5;
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        transform.Translate (Vector2.left * speed * Time.deltaTime);
    
        if(transform.position.x < 0)
           // Destroy (gameObject);
           transform.position = new Vector2(17, transform.position.y);
            
    }
}

using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class BirdMovement : MonoBehaviour
{
    public float speed = 3;
    public float force = 300;
    private Rigidbody2D rb;
    // Start is called before the first frame update
    void Start()
    {
        //bird is always going right
        rb = GetComponent<Rigidbody2D>();
        rb.velocity = Vector2.right * speed;
    }

    // Update is called once per frame
    void Update()
    {
        //if spacebar is pressed, make bird go up
        if(Input.GetKeyDown(KeyCode.Space))
        rb.AddForce(Vector2.up * force);
        //referencing rb is faster than calling getcomponent every frame
    }
    void OnCollisionEnter2D(Collision2D coll) {
      // Restart the scene when the bird collides with anything
      SceneManager.LoadScene(SceneManager.GetActiveScene().buildIndex);
    }
}

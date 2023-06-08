using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class BirdMovement : MonoBehaviour
{
    public float speed = 3;
    public float force = 300;
    private Rigidbody2D rb;
    private Animator anim;
    // Start is called before the first frame update
    void Start()
    {
        //bird is always going right
        rb = GetComponent<Rigidbody2D>();
        anim = GetComponent<Animator>();
        rb.velocity = Vector2.right * speed;
    }

    // Update is called once per frame
    void Update()
    {
        //if spacebar is pressed, make bird go up
        if(Input.GetKeyDown(KeyCode.Space)){
        rb.AddForce(Vector2.up * force);
        anim.SetTrigger("Fly");
        }
        //less costly than getcomponent
    }
    void OnCollisionEnter2D(Collision2D ob) {
      // Restart the game
      if(ob.gameObject.tag != "beep")
      SceneManager.LoadScene(SceneManager.GetActiveScene().buildIndex);
    }
    //Collision2D coll
}

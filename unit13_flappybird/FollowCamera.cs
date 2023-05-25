using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class FollowCamera : MonoBehaviour
{
    // Start is called before the first frame update
    public GameObject target;

    // Update is called once per frame
    void Update() 
    {
        Vector3 pos = new Vector3 (target.transform.position.x, target.transform.position.y, -10);
        transform.position = pos; //every frame, change camera position to the position of the gameobject target
    }
}

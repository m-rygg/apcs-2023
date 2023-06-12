## Project Description (What did I build?)

Unity is a game engine software that provides tools for game development such as a physics engine and support for graphics. Scripting in Unity is done in C#. In my project, I created a Flappy Bird remake using Unity and Pixilart.
The bird itself stays in the same horizontal position and flaps up when the space bar is pressed.
The obstacles move towards the left and continuously loop by teleporting back to the right after reaching a certain x coordinate.

I documented methods and their function in [this document](https://docs.google.com/document/d/1xxaRc_JdFWNuIKrmpABp7LaQitRE0HluvyWXeAsEchM/edit?usp=sharing)
You can find my source code [here](https://github.com/m-rygg/apcs-2023/tree/main/unit13_flappybird)

## What I learned

**Basic C# Syntax**
Learned to use basic components of C# scripting like ints, floats, if statements, and methods.

**Methods in Unity**
I learned some basics of Unity's scripting API. I documented a few methods.

Start() & Update() Methods
Start() is like a main method, it is called once at the start of the program
Update() is called once every frame--like an infinite loop 

Some Methods in the GameObject Class
GetComponent<>() gets a “component” of a GameObject. A “component” is like a certain set of attributes/methods a GameObject has. For instance, a Circle Collider component gives the GameObject a collider attribute which can interact with Unity’s physics engine
Input.GetKeyDown(KeyCode.Space) -- sort of like a java scanner, detects if you've pressed the spacebar (or another key if a different KeyCode is used)

**Pixel Art**
Use pixel art assets by dragging and dropping the files into assets and changing the sprite filter settings to “Point (No Filter)” and no compression. Otherwise, the sprite will appear blurry and sometimes discolored. 

The most difficult part was learning to work with Unity's physics engine to loop the obstacles without having bugs because of ground or sky collision.


## How you can try it

1. Go to https://m-rygg.itch.io/flappy-birb
2. Download the zipped folder
3. Unzip the folder
4. Run birb.exe

## Why this is cool

Building this mini game helped me learn how to use Unity to create games. In the future, I can apply/expand on what I learned and create more video game projects. 
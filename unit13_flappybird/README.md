## Project Description (What did I build?)

Unity is a game engine software that provides tools for game development such as a physics engine and support for graphics. Scripting in Unity is done in C#. In my project, I created a Flappy Bird remake using Unity and Pixilart.
The bird itself stays in the same horizontal position and flaps up when the space bar is pressed.
The background, obstacles, and ground all move towards the left and continuously loop by teleporting back to the right after reaching a certain x coordinate.

I documented methods and their function in [this document](https://docs.google.com/document/d/1xxaRc_JdFWNuIKrmpABp7LaQitRE0HluvyWXeAsEchM/edit?usp=sharing)
You can find my source code [here](https://github.com/m-rygg/apcs-2023/tree/main/unit13_flappybird)

## What I learned

**Basic C# Syntax**
Learned to use basic components of C# scripting like ints, floats, if statements, and methods.

**Start() & Update() Methods**
Start() is like a main method, it is called once at the start of the program
Update() is called once every frame--like an infinite loop 

**Methods in the GameObject Class**
GetComponent<>() gets a “component” of a GameObject. A “component” is like a certain set of attributes/methods a GameObject has. For instance, a Circle Collider component gives the GameObject a collider attribute which can interact with Unity’s physics engine
Input.GetKeyDown(KeyCode.Space) -- like a scanner in unity but you don’t enter a String, it will just know if the user pressed the spacebar (or another key if a different KeyCode is used)

**Pixel Art**
Use pixel art assets by dragging and dropping the files into assets and changing the sprite filter settings to “Point (No Filter)” and no compression. Otherwise, the sprite will appear blurry and sometimes discolored. 


## How you can try it

1. Make a copy of the journal, and a new document (empty is fine) for the report.
2. In your journal copy, visit menu "Extensions" > "Apps Script" and change the `reportId` at the top to be the id of your report document. The id is in the document url, after `/document/d/` and before `/edit#`.
3. Run the `doReport` function, granting security along the way (including the "unsafe, not verified by google" warning), and observe the execution log and resulting report.

## Why this is cool

This represents v2 of my volunteer tracking solutions for AFC. I previously set folks up with [Baserow](https://baserow.io/) where they could record volunteer activity in a database: visit records which reference volunteer records. This only sort-of worked, as databases (and spreadsheets) are less intuitive for non-technical users than is a journal. Being able to record data in a familiar, semi-structured manner is working well for folks at AFC.

On Thursday, June 8th, I'll meet with more folks who are interested in further tracking and reporting solutions. I am glad to have found something which resonates with the team!
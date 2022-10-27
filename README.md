# App-Development

1. User Stories

  Required:
    -User login 
    -User recommendations for each category (movies, tv shows, music, etc.)
    -Description of why it was recommended
    -Profile Pages(name, bio, reommendations etc.)
    -Friends List
    -Search Bar (places, friends, specific movies)
    -Settings (Accessibility, Notification, General etc.)
    
  Nice-to-Haves:
    -Explore page
    -Saved recommendations
    -Recommendation likes
    -Chat 
    
2. Screens

  -Login Screen
  -Register Account Screen
  -Profile Page Screen
  -Friends List Screen
  -Settings Screen
  -Search Bar Screen
  -Chat Screen
		
  
  
3. Tab Navigation:
 
  -Friends
  -Home
  -Chat
  -User Profile
	
4. Wireframes
![IMG_1438](https://user-images.githubusercontent.com/70450120/193641889-6c40af91-6e28-48df-a849-acacff7c932f.jpg)

5. Digital Wireframes/Mockups
<img width="248" alt="image" src="https://user-images.githubusercontent.com/70450120/193645598-1377b93f-7996-4f97-ad57-21f687bed86c.png">



### Data Models

User Profile
|Property|Type|Description| 
|---|---|---|
|`username`|String|unique username for user
|`email`|String|email for each user
|`profilePic`|File|profile picture for each user
|`bio`|String|personalized bio

Rekko (Post)
|Property|Type|Description| 
|---|---|---|
|`rekkoType`|String|Type of reccomendation (i.e Music, Movies, or TV Shows)
|`rekkoName`|String|Name of recommendation
|`description`|String|Description of what the recommendation is
|`testimonies`|String|User testimony as to why they decided to recommend said recommendation


### Networking

- User Profile Screen
    - (Read/GET) Query logged in user object
    - (Update/PUT) Update email
    - (Update/PUT) Update bio
    - (Update/PUT) Update user profile image
    
- Create Rekko Post Screen
    - (Create/POST) Create the rekko post object
    - (Create/POST) Create testimony for rekko
    - (Update/PUT) Update testimony
    - (Delete/DELETE) Delete rekko
    
- Explore Page (Home) Screen
    - (Read/GET) Query all rekko types with top 3 highest recommendations
    - (Read/GET) Query all posts where name of rekko matches name entered in search bar
    
- Friends Screen
    - (Read/GET) Query all people that are friends with user
    - (Read/GET) Query 3 random rekkos from friends' profiles 
    
    
   
### Gif

![Milestone3Gif](https://user-images.githubusercontent.com/70450120/196840885-95eeb93a-85bd-4118-a7d6-4cfecaa1b8eb.gif)
![Milestone3Gif](https://github.com/FAMU-App-Dev/App-Development/blob/main/sprint3.gif)


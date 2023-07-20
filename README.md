Connect - Video Calling App

Connect is an Android video calling app that allows users to connect with each other through secure and private video calls. The app is developed using WebRTC API, ensuring seamless real-time video streaming and audio transmission. Users can make free video calls and chat with other registered users from any location with an internet connection.
Features

Real-time video and audio calling using WebRTC media streaming APIs.
In-call chat and file sharing through WebRTC data channels.
Secure user authentication using OAuth 2.0.
Firebase Realtime Database for user profiles and contact management.
End-to-end encryption for video and chat data, ensuring privacy.
Adaptive bitrate control for optimal video quality based on network conditions.
Background service for maintaining an active signaling connection and handling incoming call notifications.
Push notifications using Firebase Cloud Messaging.
Dynamic video resolution adjustment for low-bandwidth scenarios.
Efficient hardware-accelerated rendering using OpenGL ES.
ProGuard code obfuscation for enhanced security and reduced app size.
Material Design UI for a consistent and visually appealing user experience.

Getting Started

To use Connect, follow these steps:

Clone the repository to your local machine using:

bash

git clone https://github.com/yourusername/Connect.git

Open the project in Android Studio.

Run the app on an Android device or emulator.

Register an account and log in to start making video calls.

Requirements

Android Studio 4.0 or later.
Android SDK version 21 or later.
Android device or emulator with a front-facing camera and internet connection.

Permissions

Connect requires the following permissions:

Camera: To capture video streams during video calls.
Microphone: To capture audio during video calls.
Internet: To establish a connection and transmit data during video calls.
Read/Write External Storage: For in-call chat and file sharing.

Usage

Register an account and log in using your credentials.

Grant the necessary permissions for camera and microphone access.

Add contacts by searching for registered users or inviting them to join the app.

Initiate a video call by selecting a contact from your list and tapping the call button.

During the call, use the in-call chat for text communication and file sharing.

End the call by tapping the call end button.

Interfaces:

Sign in Interface:

 ![1](https://github.com/Nikhil7140/Connect/assets/139348524/8517b175-3439-4df0-bacd-295d7da3f5c1)
 
This is the first page you will see when you launch the application. 
In this interface if you have an id you can use that and sign in and if not then click on the SIGN UP in red color. 
So, you will be redirect to the sign-up page where you can create your account. 

Sign Up Interface:

 ![2](https://github.com/Nikhil7140/Connect/assets/139348524/1bd8ef9e-33d3-4a62-bb30-662a721db06f)
 

Here you can make your new account in order to use application. 
Fill up all the details in order to make an account. 
After signing up you will redirect to sign in page and from there you can login to application. 
Now you will see the contact interface.

Contact Interface:

 ![3](https://github.com/Nikhil7140/Connect/assets/139348524/4710cde9-af2f-4333-895c-25775656d1d9)
 
This is contact page. 
Here you can see the contact registered with connect so you can contact them.   
when you click on the video call button if user is online then it will show calling and if not then it will unable to connect

Dialing Interface:

Sender Interface:

![4](https://github.com/Nikhil7140/Connect/assets/139348524/4f3db386-ef04-467b-9546-0d7d58b13a14)


After selecting the contact, the user will see this interface where user can see to whom call is going with name in center and email below it.
The red cross button will cancel the call immediate so the request won’t be sent to receiver. 

Receiver Interface:

 ![5](https://github.com/Nikhil7140/Connect/assets/139348524/b5ed4045-32b5-400b-ae92-41cb864ca502)
 
 
Above interface is the call receiving interface. It will be prompted when ever o user will receive call from another user.
Call request sender name will be in the middle and email would be below it.
The green button with the right sigh will accept the request of call and the red button with cross will reject the request.
Rejecting call will redirect to the contact interface.

Meeting Interface:

![6](https://github.com/Nikhil7140/Connect/assets/139348524/612f7229-9ebc-4a86-9baa-27fa4771dd9b)

After accepting the request both user will be able to see the meeting interface
Where they can see live video and audio feed of each other.
There are two white buttons at the bottom with video and audio icon which help user to disable or enable the audio or video during the session.
In between those 2 buttons there is a red button with dialer icon which can end the meeting for user who clicked on it.
At the bottom user have the preview of all present user in meeting in tile format from where they can decide to enlarge particular user. 

Chat Room Interface:

![7](https://github.com/Nikhil7140/Connect/assets/139348524/c529012f-5572-429c-9c00-c0a7a9c3e283)

On the left side beside the mic button there is icon for message which will redirect user to chat room.
Where they can type text messages to communicate with each other.
It will only save the chat till the meeting is live after that it will be deleted.

Meeting Features: 

![8](https://github.com/Nikhil7140/Connect/assets/139348524/2343fa26-6a7e-4cfb-b44c-316d17949361)

By click on the 3 dots in meeting interface user will be prompted with all this features list.


Select Sound Device:

![9](https://github.com/Nikhil7140/Connect/assets/139348524/79dc711a-268c-409f-9cec-a55898bf37f1)


By clicking here user will see the option to change the output sound device.
Available output device will be listed as above.
Blue text indicates the currently used device. 


Enable low bandwidth mode:

If user is not having good internet connection or then low bandwidth mode will be useful for them.
By enabling it the audio and video will be stopped and other users video quality will also be compressed in order to continue the call with lower bandwidth. 

Raise your hand:

![10](https://github.com/Nikhil7140/Connect/assets/139348524/1c7d6d84-363d-4568-9865-de6cfab2679d)

By clicking on raise your hand user will have the hand sign in top left corner of the preview tile.
Which will tell the host or other user that you have raised a query.

Enter Lobby Mode:

By entering in lobby mode host will decide whom to keep in the meeting and whom to not.
Host can kick any participant out and not let other participant join the meeting.

Start Screen Sharing:

By this user’s device display will be share to everyone in meeting for it user need to give permission to share the screen form the phone.

Toggle Camera:

Toggle camera will be used to change the input camera. 
As most of smartphone have rear and front camera so user will have choice which camera to use.

Enter Tile View:

![11](https://github.com/Nikhil7140/Connect/assets/139348524/eafc48dc-fcf2-4403-9986-4491a7ba9e8a)

By entering in tile view the preview will gone and ever user will have equal amount of window on meeting interface as above.
 
Start Recording:

![12](https://github.com/Nikhil7140/Connect/assets/139348524/a9e4353b-522e-4b79-8123-8500e877c9ed)

By starting recording all the meeting participant can see the rec circle with REC text in the red circle on top right corner of meeting interface so that everyone can know that meeting is being recorded.
The recording will be saved on cloud.


Start Live Stream:

![13](https://github.com/Nikhil7140/Connect/assets/139348524/c04a2738-a751-4bd9-b049-fb8772b6803c)

By click on start live stream user will be prompted with the google sign in option or to provide YouTube stream key which can be found on YouTube website.
This is mandatory to stream the direct live feed to YouTube.

Share A YouTube Video:

![14](https://github.com/Nikhil7140/Connect/assets/139348524/b946ae00-0b62-4544-ab07-206ff9ac1bf7)

By selecting this option user will be prompted with the pop-up box requiring the YouTube video link.•	This will direct fetch the video from YouTube and play it in the meeting.



Add Metting Password:

![15](https://github.com/Nikhil7140/Connect/assets/139348524/281c8584-d4bc-4e04-9b62-abf27dab3104)


By selecting this option user will be prompted with the pop-up box requiring the password for meeting.
By doing this every participant need the password to join the meeting.


Mute Everyone:

By selecting this option all the user available in meeting will be muted.


Contributing

We welcome contributions to improve Connect and make it even better! If you find any issues or have suggestions for new features, please feel free to open an issue or submit a pull request. Your feedback is invaluable to us.

Credits

    WebRTC API: WebRTC
    Firebase Realtime Database: Firebase

Acknowledgments

We would like to express our gratitude to the WebRTC community and other open-source projects that made this app possible.

Thank you for using Connect!

Happy video calling! 📞✨

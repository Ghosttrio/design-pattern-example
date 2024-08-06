package org.ghosttrio.mediator;

public class VideoMediator {
    private VideoPlayer videoPlayer;
    private TitleUI titleUI;

    public void selectVideo(int a) {
        videoPlayer.play(a);
        titleUI.setTitle(a);
    }
}

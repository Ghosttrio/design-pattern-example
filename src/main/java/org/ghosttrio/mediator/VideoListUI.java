package org.ghosttrio.mediator;

public class VideoListUI {
    private VideoMediator videoMediator;

    public void onSelectedItem(int selectedIdx) {
        videoMediator.selectVideo(selectedIdx);
    }
}

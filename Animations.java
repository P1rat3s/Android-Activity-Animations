import android.app.Activity;

public class Animations {
    Activity activity;

    public Animations(Activity activity) {
        this.activity = activity;
    }

    public void showAnimation(String string){
        switch (string){
            case "Card":
                this.activity.overridePendingTransition(
                        R.anim.animate_card_enter,
                        R.anim.animate_card_exit
                );
                break;
            case "Windmill":
                this.activity.overridePendingTransition(
                        R.anim.animate_windmill_enter,
                        R.anim.animate_windmill_exit
                );
                break;
            case "Slide In Left":
                this.activity.overridePendingTransition(
                        R.anim.animate_slide_left_enter,
                        R.anim.animate_slide_left_exit
                );
                break;
            case "Diagonal Right":
                this.activity.overridePendingTransition(
                        R.anim.animate_diagonal_right_enter,
                        R.anim.animate_diagonal_right_exit
                );
                break;
            case "Fade":
                this.activity.overridePendingTransition(
                        R.anim.animate_fade_enter,
                        R.anim.animate_fade_exit
                );
                break;
            case "In Out":
                this.activity.overridePendingTransition(
                        R.anim.animate_in_out_enter,
                        R.anim.animate_in_out_exit
                );
                break;
            case "Shrink":
                this.activity.overridePendingTransition(
                        R.anim.animate_shrink_enter,
                        R.anim.animate_shrink_exit
                );
                break;
            case "Slide Down":
                this.activity.overridePendingTransition(
                        R.anim.animate_slide_down_enter,
                        R.anim.animate_slide_down_exit
                );
                break;
            case "Slide Up":
                this.activity.overridePendingTransition(
                        R.anim.animate_slide_up_enter,
                        R.anim.animate_slide_up_exit
                );
                break;

            case "Spin":
                this.activity.overridePendingTransition(
                        R.anim.animate_spin_enter,
                        R.anim.animate_spin_exit
                );
                break;
            case "Spit":
                this.activity.overridePendingTransition(
                        R.anim.animate_split_enter,
                        R.anim.animate_split_exit
                );
                break;
            case "Swipe Left":
                this.activity.overridePendingTransition(
                        R.anim.animate_swipe_left_enter,
                        R.anim.animate_swipe_left_exit
                );
                break;
            case "Swipe Right":
                this.activity.overridePendingTransition(
                        R.anim.animate_swipe_right_enter,
                        R.anim.animate_swipe_right_exit
                );
                break;
            case "Slide":
                this.activity.overridePendingTransition(
                        R.anim.animate_slide_in_left,
                        R.anim.animate_slide_out_right
                );
                break;
            case "Zoom":
                this.activity.overridePendingTransition(
                        R.anim.animate_zoom_enter,
                        R.anim.animate_zoom_exit
                );
                break;

        }
    }
}
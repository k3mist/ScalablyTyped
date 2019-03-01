package typings
package flexsliderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexSliderOptions extends js.Object {
                //Callback: function(slider) - Fires when the slider reaches the last slide (asynchronous)
  var added: js.UndefOr[js.Function1[/* slider */ SliderObject, _]] = js.undefined
             //Callback: function(slider) - Fires asynchronously with each slider animation
  var after: js.UndefOr[js.Function1[/* slider */ SliderObject, _]] = js.undefined
         //{NEW} Selector: Must match a simple pattern. '{container} > {slide}' -- Ignore pattern at your own peril
  var animation: js.UndefOr[java.lang.String] = js.undefined
                   //{NEW} Boolean: Reverse the animation direction
  var animationLoop: js.UndefOr[scala.Boolean] = js.undefined
             //Integer: Set the speed of the slideshow cycling, in milliseconds
  var animationSpeed: js.UndefOr[scala.Double] = js.undefined
                         //{NEW} Selector: Mirror the actions performed on this slider with another slider. Use with care.
  var asNavFor: js.UndefOr[java.lang.String] = js.undefined
              //Callback: function(slider) - Fires when the slider loads the first slide
  var before: js.UndefOr[js.Function1[/* slider */ SliderObject, _]] = js.undefined
                     //{NEW} Boolean: If using video in the slider, will prevent CSS3 3D Transforms to avoid graphical glitches
  // Primary Controls
  var controlNav: js.UndefOr[js.Any] = js.undefined
                 //String: Set the text for the "play" pausePlay item
  // Special properties
  var controlsContainer: js.UndefOr[java.lang.String] = js.undefined
                 //{NEW} String: Determines the easing method used in jQuery transitions. jQuery easing plugin is supported!
  var direction: js.UndefOr[java.lang.String] = js.undefined
                 //Boolean: Create navigation for paging control of each clide? Note: Leave true for manualControls usage
  var directionNav: js.UndefOr[scala.Boolean] = js.undefined
                //String: Select your animation type, "fade" or "slide"
  var easing: js.UndefOr[java.lang.String] = js.undefined
              //Callback: function(slider) - Fires after each slider animation completes
  var end: js.UndefOr[js.Function1[/* slider */ SliderObject, _]] = js.undefined
              //Integer: Set the speed of animations, in milliseconds
  var initDelay: js.UndefOr[scala.Double] = js.undefined
                     //{NEW} Integer: Box-model width of individual carousel items, including horizontal borders and padding.
  var itemMargin: js.UndefOr[scala.Double] = js.undefined
                     //{NEW} Selector: Internal property exposed for turning the slider into a thumbnail navigation for another slider
  // Carousel Options
  var itemWidth: js.UndefOr[scala.Double] = js.undefined
                 //String: Set the text for the "next" directionNav item
  // Secondary Navigation
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
            //{UPDATED} Selector: USE CLASS SELECTOR. Declare which container the navigation elements should be appended too. Default container is the FlexSlider element. Example use would be ".flexslider-container". Property is ignored if given element is not found.
  var manualControls: js.UndefOr[java.lang.String] = js.undefined
                      //{NEW} Integer: Minimum number of carousel items that should be visible. Items will resize fluidly when below this.
  var maxItems: js.UndefOr[scala.Double] = js.undefined
                    //{NEW} Integer: Margin between carousel items.
  var minItems: js.UndefOr[scala.Double] = js.undefined
          //{NEW} Boolean: Allow keyboard navigation to affect multiple sliders. Default behavior cuts out keyboard navigation with more than one slider present.
  var mousewheel: js.UndefOr[scala.Boolean] = js.undefined
                      //{NEW} Integer: Maxmimum number of carousel items that should be visible. Items will resize fluidly when above this limit.
  var move: js.UndefOr[scala.Double] = js.undefined
                   //Boolean: Allow slider navigating via keyboard left/right keys
  var multipleKeyboard: js.UndefOr[scala.Boolean] = js.undefined
  var namespace: js.UndefOr[java.lang.String] = js.undefined
             //String: Set the text for the "previous" directionNav item
  var nextText: js.UndefOr[java.lang.String] = js.undefined
                 //Boolean: Randomize slide order
  // Usability features
  var pauseOnAction: js.UndefOr[scala.Boolean] = js.undefined
              //Boolean: Pause the slideshow when interacting with control elements, highly recommended.
  var pauseOnHover: js.UndefOr[scala.Boolean] = js.undefined
                //{UPDATED} Boolean: Requires jquery.mousewheel.js (https://github.com/brandonaaron/jquery-mousewheel) - Allows slider navigating via mousewheel
  var pausePlay: js.UndefOr[scala.Boolean] = js.undefined
                 //Boolean: Create pause/play dynamic element
  var pauseText: js.UndefOr[java.lang.String] = js.undefined
               //String: Set the text for the "pause" pausePlay item
  var playText: js.UndefOr[java.lang.String] = js.undefined
               //Boolean: Create navigation for previous/next navigation? (true/false)
  var prevText: js.UndefOr[java.lang.String] = js.undefined
                     //{NEW} Integer: Set an initialization delay, in milliseconds
  var randomize: js.UndefOr[scala.Boolean] = js.undefined
              //{NEW} Callback: function(slider) - Fires after a slide is added
  var removed: js.UndefOr[js.Function1[/* slider */ SliderObject, _]] = js.undefined
          //String: Select the sliding direction, "horizontal" or "vertical"
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
               //{NEW} String: Prefix string attached to the class of every element generated by the plugin
  var selector: js.UndefOr[java.lang.String] = js.undefined
                       //Integer: The slide that the slider should start on. Array notation (0 = first slide)
  var slideshow: js.UndefOr[scala.Boolean] = js.undefined
                  //Boolean: Animate slider automatically
  var slideshowSpeed: js.UndefOr[scala.Double] = js.undefined
               //Boolean: Should the animation loop? If boolean; directionNav will received "disable" classes at either end
  var smoothHeight: js.UndefOr[scala.Boolean] = js.undefined
                          //{NEW} Integer: Number of carousel items that should move on animation. If number; slider will move all visible items.
  // Callback API
  var start: js.UndefOr[js.Function1[/* slider */ SliderObject, _]] = js.undefined
              //{NEW} Boolean: Allow height of the slider to animate smoothly in horizontal mode
  var startAt: js.UndefOr[scala.Double] = js.undefined
               //Selector: Declare custom control navigation. Examples would be ".flex-control-nav li" or "#tabs-nav li img", etc. The number of elements in your controlNav should match the number of slides/tabs.
  var sync: js.UndefOr[java.lang.String] = js.undefined
                     //{NEW} Boolean: Slider will use CSS3 transitions if available
  var touch: js.UndefOr[scala.Boolean] = js.undefined
              //Boolean: Pause the slideshow when hovering over slider, then resume when no longer hovering
  var useCSS: js.UndefOr[scala.Boolean] = js.undefined
                      //{NEW} Boolean: Allow touch swipe navigation of the slider on touch-enabled devices
  var video: js.UndefOr[scala.Boolean] = js.undefined
}

object FlexSliderOptions {
  @scala.inline
  def apply(
    added: js.Function1[/* slider */ SliderObject, _] = null,
    after: js.Function1[/* slider */ SliderObject, _] = null,
    animation: java.lang.String = null,
    animationLoop: js.UndefOr[scala.Boolean] = js.undefined,
    animationSpeed: scala.Int | scala.Double = null,
    asNavFor: java.lang.String = null,
    before: js.Function1[/* slider */ SliderObject, _] = null,
    controlNav: js.Any = null,
    controlsContainer: java.lang.String = null,
    direction: java.lang.String = null,
    directionNav: js.UndefOr[scala.Boolean] = js.undefined,
    easing: java.lang.String = null,
    end: js.Function1[/* slider */ SliderObject, _] = null,
    initDelay: scala.Int | scala.Double = null,
    itemMargin: scala.Int | scala.Double = null,
    itemWidth: scala.Int | scala.Double = null,
    keyboard: js.UndefOr[scala.Boolean] = js.undefined,
    manualControls: java.lang.String = null,
    maxItems: scala.Int | scala.Double = null,
    minItems: scala.Int | scala.Double = null,
    mousewheel: js.UndefOr[scala.Boolean] = js.undefined,
    move: scala.Int | scala.Double = null,
    multipleKeyboard: js.UndefOr[scala.Boolean] = js.undefined,
    namespace: java.lang.String = null,
    nextText: java.lang.String = null,
    pauseOnAction: js.UndefOr[scala.Boolean] = js.undefined,
    pauseOnHover: js.UndefOr[scala.Boolean] = js.undefined,
    pausePlay: js.UndefOr[scala.Boolean] = js.undefined,
    pauseText: java.lang.String = null,
    playText: java.lang.String = null,
    prevText: java.lang.String = null,
    randomize: js.UndefOr[scala.Boolean] = js.undefined,
    removed: js.Function1[/* slider */ SliderObject, _] = null,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    selector: java.lang.String = null,
    slideshow: js.UndefOr[scala.Boolean] = js.undefined,
    slideshowSpeed: scala.Int | scala.Double = null,
    smoothHeight: js.UndefOr[scala.Boolean] = js.undefined,
    start: js.Function1[/* slider */ SliderObject, _] = null,
    startAt: scala.Int | scala.Double = null,
    sync: java.lang.String = null,
    touch: js.UndefOr[scala.Boolean] = js.undefined,
    useCSS: js.UndefOr[scala.Boolean] = js.undefined,
    video: js.UndefOr[scala.Boolean] = js.undefined
  ): FlexSliderOptions = {
    val __obj = js.Dynamic.literal()
    if (added != null) __obj.updateDynamic("added")(added)
    if (after != null) __obj.updateDynamic("after")(after)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (!js.isUndefined(animationLoop)) __obj.updateDynamic("animationLoop")(animationLoop)
    if (animationSpeed != null) __obj.updateDynamic("animationSpeed")(animationSpeed.asInstanceOf[js.Any])
    if (asNavFor != null) __obj.updateDynamic("asNavFor")(asNavFor)
    if (before != null) __obj.updateDynamic("before")(before)
    if (controlNav != null) __obj.updateDynamic("controlNav")(controlNav)
    if (controlsContainer != null) __obj.updateDynamic("controlsContainer")(controlsContainer)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (!js.isUndefined(directionNav)) __obj.updateDynamic("directionNav")(directionNav)
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (end != null) __obj.updateDynamic("end")(end)
    if (initDelay != null) __obj.updateDynamic("initDelay")(initDelay.asInstanceOf[js.Any])
    if (itemMargin != null) __obj.updateDynamic("itemMargin")(itemMargin.asInstanceOf[js.Any])
    if (itemWidth != null) __obj.updateDynamic("itemWidth")(itemWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (manualControls != null) __obj.updateDynamic("manualControls")(manualControls)
    if (maxItems != null) __obj.updateDynamic("maxItems")(maxItems.asInstanceOf[js.Any])
    if (minItems != null) __obj.updateDynamic("minItems")(minItems.asInstanceOf[js.Any])
    if (!js.isUndefined(mousewheel)) __obj.updateDynamic("mousewheel")(mousewheel)
    if (move != null) __obj.updateDynamic("move")(move.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleKeyboard)) __obj.updateDynamic("multipleKeyboard")(multipleKeyboard)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (nextText != null) __obj.updateDynamic("nextText")(nextText)
    if (!js.isUndefined(pauseOnAction)) __obj.updateDynamic("pauseOnAction")(pauseOnAction)
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover)
    if (!js.isUndefined(pausePlay)) __obj.updateDynamic("pausePlay")(pausePlay)
    if (pauseText != null) __obj.updateDynamic("pauseText")(pauseText)
    if (playText != null) __obj.updateDynamic("playText")(playText)
    if (prevText != null) __obj.updateDynamic("prevText")(prevText)
    if (!js.isUndefined(randomize)) __obj.updateDynamic("randomize")(randomize)
    if (removed != null) __obj.updateDynamic("removed")(removed)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    if (!js.isUndefined(slideshow)) __obj.updateDynamic("slideshow")(slideshow)
    if (slideshowSpeed != null) __obj.updateDynamic("slideshowSpeed")(slideshowSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothHeight)) __obj.updateDynamic("smoothHeight")(smoothHeight)
    if (start != null) __obj.updateDynamic("start")(start)
    if (startAt != null) __obj.updateDynamic("startAt")(startAt.asInstanceOf[js.Any])
    if (sync != null) __obj.updateDynamic("sync")(sync)
    if (!js.isUndefined(touch)) __obj.updateDynamic("touch")(touch)
    if (!js.isUndefined(useCSS)) __obj.updateDynamic("useCSS")(useCSS)
    if (!js.isUndefined(video)) __obj.updateDynamic("video")(video)
    __obj.asInstanceOf[FlexSliderOptions]
  }
}


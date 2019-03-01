package typings
package photoswipeLib.distPhotoswipeDashUiDashDefaultMod.PhotoSwipeUIUnderscoreDefaultNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends photoswipeLib.photoswipeMod.PhotoSwipeNs.Options {
  /**
    * Function to build caption markup. The function takes three parameters:
    *
    * item      - slide object
    * captionEl - caption DOM element
    * isFake    - true when content is added to fake caption container
    *             (used to get size of next or previous caption)
    *
    * Return whether to show the caption or not.
    *
    * Default is:
    *
    * function(item, captionEl, isFake) {
    *     if(!item.title) {
    *         captionEl.children[0].innerHTML = '';
    *         return false;
    *     }
    *     captionEl.children[0].innerHTML = item.title;
    *     return true;
    * }
    *
    */
  var addCaptionHTMLFn: js.UndefOr[
    js.Function3[
      /* item */ Item, 
      /* captionEl */ stdLib.HTMLElement, 
      /* isFake */ scala.Boolean, 
      scala.Boolean
    ]
  ] = js.undefined
  /**
    * Whether to show the left/right directional arrows.
    *
    * Default true.
    */
  var arrowEl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Size of top & bottom bars in pixels. "bottom" parameter can be 'auto' (will calculate height of caption).
    * Option applies only when mouse is used, or when width of screen is more than 1200px.
    * Also look at `parseVerticalMargin` event.
    *
    * Default {top: 44, bottom: "auto"}.
    */
  var barsSize: js.UndefOr[photoswipeLib.Anon_Bottom] = js.undefined
  /**
    * Whether to show the caption.
    *
    * Default true.
    */
  var captionEl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Mouse click on image should close the gallery, only when image is smaller than size of the viewport.
    *
    * Default true.
    */
  var clickToCloseNonZoomable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to show the close button.
    *
    * Default true.
    */
  var closeEl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Element classes that should close PhotoSwipe when clicked on.
    * In HTML markup, class should always start with "pswp__", e.g.: "pswp__item", "pswp__caption".
    *
    * "pswp__ui--over-close" class will be added to root element of UI when mouse is over one of these elements
    * By default it's used to highlight the close button.
    *
    * Default ['item', 'caption', 'zoom-wrap', 'ui', 'top-bar'].
    */
  var closeElClasses: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Whether to show the current image's index in the gallery (located in top-left corner by default).
    *
    * Default true.
    */
  var counterEl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to show the fullscreen button.
    *
    * Default true.
    */
  var fullscreenEl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A callback that should return the URL for the currently selected image. The callback is passed
    * the shareButtonData entry that was clicked on.
    *
    * Default is:
    *
    * function( shareButtonData ) {
    *     // `shareButtonData` - object from shareButtons array
    *     //
    *     // `pswp` is the gallery instance object,
    *     // you should define it by yourself
    *     //
    *     return pswp.currItem.src || '';
    * }
    *
    */
  var getImageURLForShare: js.UndefOr[js.Function1[/* shareButtonData */ ShareButtonData, java.lang.String]] = js.undefined
  /**
    * A callback that should return the "Page" associated with the selected image. (e.g. on Facebook, the shared
    * content will be associated with the returned page). The callback is passed the shareButtonData entry that
    * was clicked on.
    *
    * Default is:
    *
    * function( shareButtonData ) {
    *     return window.location.href;
    * }
    *
    */
  var getPageURLForShare: js.UndefOr[js.Function1[/* shareButtonData */ ShareButtonData, java.lang.String]] = js.undefined
  /**
    * A callback that should return the Text associated with the selected image. The callback is passed
    * the shareButtonData entry that was clicked on.
    *
    * Default is:
    *
    * function( shareButtonData ) {
    *     return pswp.currItem.title || '';
    * }
    *
    */
  var getTextForShare: js.UndefOr[js.Function1[/* shareButtonData */ ShareButtonData, java.lang.String]] = js.undefined
  /**
    * Separator for "1 of X" counter.
    *
    * Default ' / '.
    */
  var indexIndicatorSep: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Delay in milliseconds until loading indicator is displayed.
    *
    * Default 1000.
    */
  var loadingIndicatorDelay: js.UndefOr[scala.Double] = js.undefined
  /**
    * A final output callback that you can use to further modify the share button's HTML. The callback is passed
    * (1) the shareButtonData entry being generated, and (2) the default HTML generated by PhotoSwipUI_Default.
    *
    * Default is:
    *
    * function(shareButtonData, shareButtonOut) {
    *     return shareButtonOut;
    * }
    *
    */
  var parseShareButtonOut: js.UndefOr[
    js.Function2[
      /* shareButtonData */ ShareButtonData, 
      /* shareButtonOut */ java.lang.String, 
      java.lang.String
    ]
  ] = js.undefined
  /**
    * Whether to show the preloader element.
    *
    * Default true.
    */
  var preloaderEl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The entries that show up when you click the Share button.
    *
    * Default is:
    *
    * [
    *     {id:'facebook', label:'Share on Facebook', url:'https://www.facebook.com/sharer/sharer.php?u='},
    *     {id:'twitter', label:'Tweet', url:'https://twitter.com/intent/tweet?text=&url='},
    *     {id:'pinterest', label:'Pin it', url:'http://www.pinterest.com/pin/create/button/?url=&media=&description='},
    *     {id:'download', label:'Download image', url:'', download:true}
    * ]
    *
    */
  var shareButtons: js.UndefOr[js.Array[ShareButtonData]] = js.undefined
  /**
    * Whether to show the share button.
    *
    * Default true.
    */
  var shareEl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Tap on sliding area should close gallery.
    *
    * Default false.
    */
  var tapToClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Tap should toggle visibility of controls.
    *
    * Default true.
    */
  var tapToToggleControls: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Adds class pswp__ui--idle to pswp__ui element when mouse isn't moving for timeToIdle milliseconds.
    *
    * Default 4000.
    */
  var timeToIdle: js.UndefOr[scala.Double] = js.undefined
  /**
    * Adds class pswp__ui--idle to pswp__ui element when mouse leaves the window for timeToIdleOutside milliseconds.
    *
    * Default 1000.
    */
  var timeToIdleOutside: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to show the zoom button.
    *
    * Default true.
    */
  var zoomEl: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    addCaptionHTMLFn: js.Function3[
      /* item */ Item, 
      /* captionEl */ stdLib.HTMLElement, 
      /* isFake */ scala.Boolean, 
      scala.Boolean
    ] = null,
    allowNoPanText: js.UndefOr[scala.Boolean] = js.undefined,
    arrowEl: js.UndefOr[scala.Boolean] = js.undefined,
    arrowKeys: js.UndefOr[scala.Boolean] = js.undefined,
    barsSize: photoswipeLib.Anon_Bottom = null,
    bgOpacity: scala.Int | scala.Double = null,
    captionEl: js.UndefOr[scala.Boolean] = js.undefined,
    clickToCloseNonZoomable: js.UndefOr[scala.Boolean] = js.undefined,
    closeEl: js.UndefOr[scala.Boolean] = js.undefined,
    closeElClasses: js.Array[java.lang.String] = null,
    closeOnScroll: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnVerticalDrag: js.UndefOr[scala.Boolean] = js.undefined,
    counterEl: js.UndefOr[scala.Boolean] = js.undefined,
    errorMsg: java.lang.String = null,
    escKey: js.UndefOr[scala.Boolean] = js.undefined,
    focus: js.UndefOr[scala.Boolean] = js.undefined,
    fullscreenEl: js.UndefOr[scala.Boolean] = js.undefined,
    galleryUID: scala.Int | scala.Double = null,
    getDoubleTapZoom: js.Function2[
      /* isMouseClick */ scala.Boolean, 
      /* item */ photoswipeLib.photoswipeMod.PhotoSwipeNs.Item, 
      scala.Double
    ] = null,
    getImageURLForShare: js.Function1[/* shareButtonData */ ShareButtonData, java.lang.String] = null,
    getNumItemsFn: js.Function0[scala.Double] = null,
    getPageURLForShare: js.Function1[/* shareButtonData */ ShareButtonData, java.lang.String] = null,
    getTextForShare: js.Function1[/* shareButtonData */ ShareButtonData, java.lang.String] = null,
    getThumbBoundsFn: js.Function1[/* index */ scala.Double, photoswipeLib.Anon_W] = null,
    hideAnimationDuration: scala.Int | scala.Double = null,
    history: js.UndefOr[scala.Boolean] = js.undefined,
    index: scala.Int | scala.Double = null,
    indexIndicatorSep: java.lang.String = null,
    isClickableElement: js.Function1[/* el */ stdLib.HTMLElement, scala.Boolean] = null,
    loadingIndicatorDelay: scala.Int | scala.Double = null,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    mainClass: java.lang.String = null,
    mainScrollEndFriction: scala.Int | scala.Double = null,
    maxSpreadZoom: scala.Int | scala.Double = null,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    mouseUsed: js.UndefOr[scala.Boolean] = js.undefined,
    panEndFriction: scala.Int | scala.Double = null,
    parseShareButtonOut: js.Function2[
      /* shareButtonData */ ShareButtonData, 
      /* shareButtonOut */ java.lang.String, 
      java.lang.String
    ] = null,
    pinchToClose: js.UndefOr[scala.Boolean] = js.undefined,
    preload: js.Array[scala.Double] = null,
    preloaderEl: js.UndefOr[scala.Boolean] = js.undefined,
    shareButtons: js.Array[ShareButtonData] = null,
    shareEl: js.UndefOr[scala.Boolean] = js.undefined,
    showAnimationDuration: scala.Int | scala.Double = null,
    showHideOpacity: js.UndefOr[scala.Boolean] = js.undefined,
    spacing: scala.Int | scala.Double = null,
    tapToClose: js.UndefOr[scala.Boolean] = js.undefined,
    tapToToggleControls: js.UndefOr[scala.Boolean] = js.undefined,
    timeToIdle: scala.Int | scala.Double = null,
    timeToIdleOutside: scala.Int | scala.Double = null,
    zoomEl: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (addCaptionHTMLFn != null) __obj.updateDynamic("addCaptionHTMLFn")(addCaptionHTMLFn)
    if (!js.isUndefined(allowNoPanText)) __obj.updateDynamic("allowNoPanText")(allowNoPanText)
    if (!js.isUndefined(arrowEl)) __obj.updateDynamic("arrowEl")(arrowEl)
    if (!js.isUndefined(arrowKeys)) __obj.updateDynamic("arrowKeys")(arrowKeys)
    if (barsSize != null) __obj.updateDynamic("barsSize")(barsSize)
    if (bgOpacity != null) __obj.updateDynamic("bgOpacity")(bgOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(captionEl)) __obj.updateDynamic("captionEl")(captionEl)
    if (!js.isUndefined(clickToCloseNonZoomable)) __obj.updateDynamic("clickToCloseNonZoomable")(clickToCloseNonZoomable)
    if (!js.isUndefined(closeEl)) __obj.updateDynamic("closeEl")(closeEl)
    if (closeElClasses != null) __obj.updateDynamic("closeElClasses")(closeElClasses)
    if (!js.isUndefined(closeOnScroll)) __obj.updateDynamic("closeOnScroll")(closeOnScroll)
    if (!js.isUndefined(closeOnVerticalDrag)) __obj.updateDynamic("closeOnVerticalDrag")(closeOnVerticalDrag)
    if (!js.isUndefined(counterEl)) __obj.updateDynamic("counterEl")(counterEl)
    if (errorMsg != null) __obj.updateDynamic("errorMsg")(errorMsg)
    if (!js.isUndefined(escKey)) __obj.updateDynamic("escKey")(escKey)
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus)
    if (!js.isUndefined(fullscreenEl)) __obj.updateDynamic("fullscreenEl")(fullscreenEl)
    if (galleryUID != null) __obj.updateDynamic("galleryUID")(galleryUID.asInstanceOf[js.Any])
    if (getDoubleTapZoom != null) __obj.updateDynamic("getDoubleTapZoom")(getDoubleTapZoom)
    if (getImageURLForShare != null) __obj.updateDynamic("getImageURLForShare")(getImageURLForShare)
    if (getNumItemsFn != null) __obj.updateDynamic("getNumItemsFn")(getNumItemsFn)
    if (getPageURLForShare != null) __obj.updateDynamic("getPageURLForShare")(getPageURLForShare)
    if (getTextForShare != null) __obj.updateDynamic("getTextForShare")(getTextForShare)
    if (getThumbBoundsFn != null) __obj.updateDynamic("getThumbBoundsFn")(getThumbBoundsFn)
    if (hideAnimationDuration != null) __obj.updateDynamic("hideAnimationDuration")(hideAnimationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(history)) __obj.updateDynamic("history")(history)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (indexIndicatorSep != null) __obj.updateDynamic("indexIndicatorSep")(indexIndicatorSep)
    if (isClickableElement != null) __obj.updateDynamic("isClickableElement")(isClickableElement)
    if (loadingIndicatorDelay != null) __obj.updateDynamic("loadingIndicatorDelay")(loadingIndicatorDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (mainClass != null) __obj.updateDynamic("mainClass")(mainClass)
    if (mainScrollEndFriction != null) __obj.updateDynamic("mainScrollEndFriction")(mainScrollEndFriction.asInstanceOf[js.Any])
    if (maxSpreadZoom != null) __obj.updateDynamic("maxSpreadZoom")(maxSpreadZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (!js.isUndefined(mouseUsed)) __obj.updateDynamic("mouseUsed")(mouseUsed)
    if (panEndFriction != null) __obj.updateDynamic("panEndFriction")(panEndFriction.asInstanceOf[js.Any])
    if (parseShareButtonOut != null) __obj.updateDynamic("parseShareButtonOut")(parseShareButtonOut)
    if (!js.isUndefined(pinchToClose)) __obj.updateDynamic("pinchToClose")(pinchToClose)
    if (preload != null) __obj.updateDynamic("preload")(preload)
    if (!js.isUndefined(preloaderEl)) __obj.updateDynamic("preloaderEl")(preloaderEl)
    if (shareButtons != null) __obj.updateDynamic("shareButtons")(shareButtons)
    if (!js.isUndefined(shareEl)) __obj.updateDynamic("shareEl")(shareEl)
    if (showAnimationDuration != null) __obj.updateDynamic("showAnimationDuration")(showAnimationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(showHideOpacity)) __obj.updateDynamic("showHideOpacity")(showHideOpacity)
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (!js.isUndefined(tapToClose)) __obj.updateDynamic("tapToClose")(tapToClose)
    if (!js.isUndefined(tapToToggleControls)) __obj.updateDynamic("tapToToggleControls")(tapToToggleControls)
    if (timeToIdle != null) __obj.updateDynamic("timeToIdle")(timeToIdle.asInstanceOf[js.Any])
    if (timeToIdleOutside != null) __obj.updateDynamic("timeToIdleOutside")(timeToIdleOutside.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomEl)) __obj.updateDynamic("zoomEl")(zoomEl)
    __obj.asInstanceOf[Options]
  }
}


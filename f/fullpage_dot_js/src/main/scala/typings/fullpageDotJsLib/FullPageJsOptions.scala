package typings
package fullpageDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullPageJsOptions extends js.Object {
  /**
    * Callback fired once the sections have been loaded, after the scrolling has ended.
    * @param anchorLink anchorLink corresponding to the section.
    * @param index index of the section. Starting from 1.
    */
  var afterLoad: js.UndefOr[
    js.Function2[/* anchorLink */ java.lang.String, /* index */ scala.Double, scala.Unit]
  ] = js.undefined
  /**
    * This callback is fired just after the structure of the page is generated. This is the callback you want to use to initialize other plugins or fire any code which requires the document to be ready (as this plugin modifies the DOM to create the resulting structure).
    */
  var afterRender: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * This callback is fired after resizing the browser's window. Just after the sections are resized.
    */
  var afterResize: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * This callback is fired after fullpage.js changes from normal to responsive mode or from responsive mode to normal mode.
    * @param {boolean} isResponsive boolean that determines if it enters into responsive mode (true) or goes back to normal mode (false)
    */
  var afterResponsive: js.UndefOr[js.Function1[/* isResponsive */ scala.Boolean, scala.Unit]] = js.undefined
  /**
    * Callback fired once the slide of a section have been loaded, after the scrolling has ended.
    *
    * In case of not having anchorLinks defined for the slide or slides the slideIndex parameter would be the only one to use.
    *
    * Parameters:
    *
    * @param anchorLink anchorLink corresponding to the section.
    * @param index index of the section. Starting from 1.
    * @param slideAnchor anchor corresponding to the slide (in case there is)
    * @param slideIndex index of the slide. Starting from 1. (the default slide doesn't count as slide, but as a section)
    */
  var afterSlideLoad: js.UndefOr[
    js.Function4[
      /* anchorLink */ java.lang.String, 
      /* index */ scala.Double, 
      /* slideAnchor */ java.lang.String, 
      /* slideIndex */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * (default []) Defines the anchor links (#example) to be shown on the URL for each section. Anchors value should be unique. The position of the anchors in the array will define to which sections the anchor is applied. (second position for second section and so on). Using anchors forward and backward navigation will also be possible through the browser. This option also allows users to bookmark a specific section or slide. Be careful! anchors can not have the same value as any ID element on the site (or NAME element for IE). Now anchors can be defined directly in the HTML structure by using the attribute data-anchor as explained here.
    */
  var anchors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * (default true) Defines whether the load of the site when given an anchor (#) will scroll with animation to its destination or will directly load on the given section.
    */
  var animateAnchor: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * (default true) Defines whether to use the "automatic" scrolling or the "normal" one. It also has affects the way the sections fit in the browser/device window in tablets and mobile phones.
    */
  var autoScrolling: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Defines how to scroll to a section which size is bigger than the viewport. By default fullPage.js scrolls to the top if you come from a section above the destination one and to the bottom if you come from a section below the destination one.
    */
  var bigSectionsDestination: js.UndefOr[
    fullpageDotJsLib.fullpageDotJsLibStrings.top | fullpageDotJsLib.fullpageDotJsLibStrings.bottom | scala.Null
  ] = js.undefined
  /**
    * (default false) Extension of fullpage.js. Defines whether sliding right in the last slide should slide right to the first one or not, and if scrolling left in the first slide should slide left to the last one or not. Not compatible with loopHorizontal. Requires fullpage.js >= 2.8.3.
    */
  var continuousHorizontal: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * (default false) Defines whether scrolling down in the last section should scroll down to the first one or not, and if scrolling up in the first section should scroll up to the last one or not. Not compatible with loopTop or loopBottom.
    */
  var continuousVertical: js.UndefOr[scala.Boolean] = js.undefined
  // Design
  /**
    * (default: true) Determines whether to use control arrows for the slides to move right or left.
    */
  var controlArrows: js.UndefOr[scala.Boolean] = js.undefined
  // Scrolling
  /**
    * (default true). Defines whether to use JavaScript or CSS3 transforms to scroll within sections and slides. Useful to speed up the movement in tablet and mobile devices with browsers supporting CSS3. If this option is set to true and the browser doesn't support CSS3, a jQuery fallback will be used instead.
    */
  var css3: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enables or disables the dragging and flicking of sections and slides by using mouse or fingers. Requires fullpage.js >= 2.8.9. Possible values are: 
    * true: enables the feature.
    * false: disables the feature.
    * vertical: enables the feature only vertically.
    * horizontal: enables the feature only horizontally.
    * fingersonly: enables the feature for touch devices only.
    * mouseonly: enables the feature for desktop devices only (mouse and trackpad).
    */
  var dragAndMove: js.UndefOr[
    scala.Boolean | fullpageDotJsLib.fullpageDotJsLibStrings.vertical | fullpageDotJsLib.fullpageDotJsLibStrings.horizontal | fullpageDotJsLib.fullpageDotJsLibStrings.fingersonly | fullpageDotJsLib.fullpageDotJsLibStrings.mouseonly
  ] = js.undefined
  /**
    * (default easeInOutCubic) Defines the transition effect to use for the vertical and horizontal scrolling. It requires the file vendors/jquery.easings.min.js or jQuery UI for using some of its transitions. Other libraries could be used instead.
    */
  var easing: js.UndefOr[java.lang.String] = js.undefined
  /**
    * (default ease) Defines the transition effect to use in case of using css3:true. You can use the pre-defined ones (such as linear, ease-out...) or create your own ones using the cubic-bezier function. You might want to use Matthew Lein CSS Easing Animation Tool for it.
    */
  var easingcss3: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines whether to use a fading effect or not instead of the default scrolling one. Possible values are true, false, sections, slides. It can therefore be applied just vertically or horizontally, or to both at the time. Requires fullpage.js >= 2.8.6.
    */
  var fadingEffect: js.UndefOr[
    scala.Boolean | fullpageDotJsLib.fullpageDotJsLibStrings.sections | fullpageDotJsLib.fullpageDotJsLibStrings.slides
  ] = js.undefined
  /**
    * (default true). Determines whether or not to fit sections to the viewport or not. When set to true the current active section will always fill the whole viewport. Otherwise the user will be free to stop in the middle of a section (when )
    */
  var fitToSection: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * (default 1000). If fitToSection is set to true, this delays the fitting by the configured milliseconds.
    */
  var fitToSectionDelay: js.UndefOr[scala.Double] = js.undefined
  /**
    * (default null) Defines which elements will be taken off the scrolling structure of the plugin which is necessary when using the css3 option to keep them fixed. It requires a string with the jQuery selectors for those elements. (For example: fixedElements: '#element1, .element2')
    */
  var fixedElements: js.UndefOr[java.lang.String] = js.undefined
  /** 
    * (default false) Extension of fullpage.js. Determines whether moving one horizontal slider will force the sliding of sliders in other section in the same direction. Possible values are true, false or an array with the interlocked sections. For example [1,3,5] starting by 1. Requires fullpage.js >= 2.8.3. 
    */
  var interlockedSlides: js.UndefOr[scala.Boolean | js.Array[scala.Double]] = js.undefined
  // Accessibility
  /**
    * (default true) Defines if the content can be navigated using the keyboard
    */
  var keyboardScrolling: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Lazy loading is active by default which means it will lazy load any media element containing the attribute data-src as detailed in the Lazy Loading docs . If you want to use any other lazy loading library you can disable this fullpage.js feature.
    */ 
  var lazyLoading: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * (default false). Determines whether anchors in the URL will have any effect at all in the plugin. You can still using anchors internally for your own functions and callbacks, but they won't have any effect in the scrolling of the site. Useful if you want to combine fullPage.js with other plugins using anchor in the URL.
    */
  var lockAnchors: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * (default false) Defines whether scrolling down in the last section should scroll to the first one or not.
    */
  var loopBottom: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * (default true) Defines whether horizontal sliders will loop after reaching the last or previous slide or not.
    */
  var loopHorizontal: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  (default false) Defines whether scrolling up in the first section should scroll to the last one or not.
    */
  var loopTop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * (default false) A selector can be used to specify the menu to link with the sections. This way the scrolling of the sections will activate the corresponding element in the menu using the class active. This won't generate a menu but will just add the active class to the element in the given menu with the corresponding anchor links. In order to link the elements of the menu with the sections, an HTML 5 data-tag (data-menuanchor) will be needed to use with the same anchor links as used within the sections.
    */
  var menu: js.UndefOr[java.lang.String] = js.undefined
  /**
    * (default false) If set to true, it will show a navigation bar made up of small circles.
    */
  var navigation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * (default none) It can be set to left or right and defines which position the navigation bar will be shown (if using one).
    */
  var navigationPosition: js.UndefOr[java.lang.String] = js.undefined
  /**
    * (default []) Defines the tooltips to show for the navigation circles in case they are being used. Example: navigationTooltips: ['firstSlide', 'secondSlide'].
    */
  var navigationTooltips: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * (default 5) Defines the threshold for the number of hops up the html node tree Fullpage will test to see if normalScrollElements is a match to allow scrolling functionality on divs on a touch device. (For example: normalScrollElementTouchThreshold: 3)
    */
  var normalScrollElementTouchThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    *  (default null) If you want to avoid the auto scroll when scrolling over some elements, this is the option you need to use. (useful for maps, scrolling divs etc.) It requires a string with the jQuery selectors for those elements. (For example: normalScrollElements: '#element1, .element2')
    */
  var normalScrollElements: js.UndefOr[java.lang.String] = js.undefined
  /**
    * (default false)Extension of fullpage.js. Provides a way to use non full screen sections based on percentage. Ideal to show visitors there's more content in the site by showing part of the next or previous section. Requires fullPage.js >= 2.8.8 To define the percentage of each section the attribute data-percentage must be used. The centering of the section in the viewport can be determined by using a boolean value in the attribute data-centered (default to true if not specified). For example:
    */
  var offsetSections: js.UndefOr[scala.Boolean] = js.undefined
  // Events
  /**
    * This callback is fired once the user leaves a section, in the transition to the new section. Returning false will cancel the move before it takes place.
    * @param index index of the leaving section. Starting from 1.
    * @param nextIndex index of the destination section. Starting from 1.
    * @param direction it will take the values up or down depending on the scrolling direction.
    */
  var onLeave: js.UndefOr[
    js.Function3[
      /* index */ scala.Double, 
      /* nextIndex */ scala.Double, 
      /* direction */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * This callback is fired once the user leaves an slide to go to another, in the transition to the new slide. Returning false will cancel the move before it takes place.
    * @param anchorLink: anchorLink corresponding to the section.
    * @param index index of the section. Starting from 1.
    * @param slideIndex index of the slide. Starting from 0.
    * @param direction takes the values right or left depending on the scrolling direction.
    * @param nextSlideIndex index of the destination slide. Starting from 0.
    */
  var onSlideLeave: js.UndefOr[
    js.Function5[
      /* anchorLink */ java.lang.String, 
      /* index */ scala.Double, 
      /* slideIndex */ scala.Double, 
      /* direction */ java.lang.String, 
      /* nextSlideIndex */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * (default 0) Defines the bottom padding for each section with a numerical value and its measure (paddingBottom: '10px', paddingBottom: '10em'...). Useful in case of using a fixed footer.
    */
  var paddingBottom: js.UndefOr[java.lang.String] = js.undefined
  /**
    * (default 0) Defines the top padding for each section with a numerical value and its measure (paddingTop: '10px', paddingTop: '10em'...) Useful in case of using a fixed header.
    */
  var paddingTop: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When set to true slides will be turned into vertical sections when responsive mode is fired. (by using the responsiveWidth or responsiveHeight options detailed above). Requires fullpage.js >= 2.8.5.
    */
  var parallax: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Allows to configure the parameters for the parallax backgrounds effect when using the option parallax:true.
    */ 
  var parallaxOptions: js.UndefOr[Anon_Cover] = js.undefined
  /**
    * (default true) Defines whether to push the state of the site to the browser's history. When set to true each section/slide of the site will act as a new page and the back and forward buttons of the browser will scroll the sections/slides to reach the previous or next state of the site. When set to false, the URL will keep changing but will have no effect ont he browser's history. This option is automatically turned off when using autoScrolling:false.
    */
  var recordHistory: js.UndefOr[scala.Boolean] = js.undefined
  /** 
    * (default false). Extension of fullpage.js. Defines whether or not to reset every slider after leaving its section. Requires fullpage.js >= 2.8.3.
    */
  var resetSliders: js.UndefOr[scala.Boolean] = js.undefined
  var resize: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * (default 0) A normal scroll (autoScrolling:false) will be used under the defined height in pixels. A class fp-responsive is added to the body tag in case the user wants to use it for his own responsive CSS. For example, if set to 900, whenever the browser's height is less than 900 the plugin will scroll like a normal site.
    */
  var responsiveHeight: js.UndefOr[scala.Double] = js.undefined
  /** 
    * When set to true slides will be turned into vertical sections when responsive mode is fired. (by using the responsiveWidth or responsiveHeight options detailed above). Requires fullpage.js >= 2.8.5.
    */ 
  var responsiveSlides: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  (default 0) A normal scroll (autoScrolling:false) will be used under the defined width in pixels. A class fp-responsive is added to the body tag in case the user wants to use it for his own responsive CSS. For example, if set to 900, whenever the browser's width is less than 900 the plugin will scroll like a normal site.
    */
  var responsiveWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    *  (default false). Determines whether to use scrollbar for the site or not. In case of using scroll bar, the autoScrolling functionality will still working as expected. The user will also be free to scroll the site with the scroll bar and fullPage.js will fit the section in the screen when scrolling finishes.
    */
  var scrollBar: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * (default false) Extension of fullpage.js. Defines whether to slide horizontally within sliders by using the mouse wheel or trackpad. Ideal for story telling. Requires fullpage.js >= 2.8.3.
    */
  var scrollHorizontally: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * (default false) defines whether or not to create a scroll for the section/slide in case its content is bigger than the height of it. When set to true, your content will be wrapped by the plugin. Consider using delegation or load your other scripts in the afterRender callback. In case of setting it to true, it requires the vendor library scrolloverflow.min.js and it should be loaded before the fullPage.js plugin.
    */
  var scrollOverflow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * when using scrollOverflow:true fullpage.js will make use of a forked and modified version of iScroll.js libary. You can customize the scrolling behaviour by providing fullpage.js with the iScroll.js options you want to use. Check its documentation for more info.
    */
  var scrollOverflowOptions: js.UndefOr[js.Any] = js.undefined
  /**
    * When set to true it scrolls up the content of the section/slide with scroll bar when leaving to another vertical section. This way the section/slide will always show the start of its content even when scrolling from a section under it
    */
  var scrollOverflowReset: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * (default 700) Speed in milliseconds for the scrolling transitions.
    */
  var scrollingSpeed: js.UndefOr[scala.Double] = js.undefined
  // Custom selectors
  /**
    * (default .section) Defines the jQuery selector used for the plugin sections. It might need to be changed sometimes to avoid problem with other plugins using the same selectors as fullpage.js.
    */
  var sectionSelector: js.UndefOr[java.lang.String] = js.undefined
  /**
    * (default none) Define the CSS background-color property for each section
    */
  var sectionsColor: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * (default false) Shows a persistent tooltip for the actively viewed section in the vertical navigation.
    */
  var showActiveTooltip: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * (default .slide) Defines the jQuery selector used for the plugin slides. It might need to be changed sometimes to avoid problem with other plugins using the same selectors as fullpage.js.
    */
  var slideSelector: js.UndefOr[java.lang.String] = js.undefined
  /**
    * (default bottom) Defines the position for the landscape navigation bar for sliders. Admits top and bottom as values. You may want to modify the CSS styles to determine the distance from the top or bottom as well as any other style such as color.
    */
  var slidesNavPosition: js.UndefOr[java.lang.String] = js.undefined
  /**
    * (default false) If set to true it will show a navigation bar made up of small circles for each landscape slider on the site.
    */
  var slidesNavigation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * (default 5) Defines a percentage of the browsers window width/height, and how far a swipe must measure for navigating to the next section / slide
    */
  var touchSensitivity: js.UndefOr[scala.Double] = js.undefined
  /**
    * (default true) Vertically centering of the content within sections. When set to true, your content will be wrapped by the plugin. Consider using delegation or load your other scripts in the afterRender callback.
    */
  var verticalCentered: js.UndefOr[scala.Boolean] = js.undefined
}

object FullPageJsOptions {
  @scala.inline
  def apply(
    afterLoad: js.Function2[/* anchorLink */ java.lang.String, /* index */ scala.Double, scala.Unit] = null,
    afterRender: js.Function0[scala.Unit] = null,
    afterResize: js.Function0[scala.Unit] = null,
    afterResponsive: js.Function1[/* isResponsive */ scala.Boolean, scala.Unit] = null,
    afterSlideLoad: js.Function4[
      /* anchorLink */ java.lang.String, 
      /* index */ scala.Double, 
      /* slideAnchor */ java.lang.String, 
      /* slideIndex */ scala.Double, 
      scala.Unit
    ] = null,
    anchors: js.Array[java.lang.String] = null,
    animateAnchor: js.UndefOr[scala.Boolean] = js.undefined,
    autoScrolling: js.UndefOr[scala.Boolean] = js.undefined,
    bigSectionsDestination: fullpageDotJsLib.fullpageDotJsLibStrings.top | fullpageDotJsLib.fullpageDotJsLibStrings.bottom = null,
    continuousHorizontal: js.UndefOr[scala.Boolean] = js.undefined,
    continuousVertical: js.UndefOr[scala.Boolean] = js.undefined,
    controlArrows: js.UndefOr[scala.Boolean] = js.undefined,
    css3: js.UndefOr[scala.Boolean] = js.undefined,
    dragAndMove: scala.Boolean | fullpageDotJsLib.fullpageDotJsLibStrings.vertical | fullpageDotJsLib.fullpageDotJsLibStrings.horizontal | fullpageDotJsLib.fullpageDotJsLibStrings.fingersonly | fullpageDotJsLib.fullpageDotJsLibStrings.mouseonly = null,
    easing: java.lang.String = null,
    easingcss3: java.lang.String = null,
    fadingEffect: scala.Boolean | fullpageDotJsLib.fullpageDotJsLibStrings.sections | fullpageDotJsLib.fullpageDotJsLibStrings.slides = null,
    fitToSection: js.UndefOr[scala.Boolean] = js.undefined,
    fitToSectionDelay: scala.Int | scala.Double = null,
    fixedElements: java.lang.String = null,
    interlockedSlides: scala.Boolean | js.Array[scala.Double] = null,
    keyboardScrolling: js.UndefOr[scala.Boolean] = js.undefined,
    lazyLoading: js.UndefOr[scala.Boolean] = js.undefined,
    lockAnchors: js.UndefOr[scala.Boolean] = js.undefined,
    loopBottom: js.UndefOr[scala.Boolean] = js.undefined,
    loopHorizontal: js.UndefOr[scala.Boolean] = js.undefined,
    loopTop: js.UndefOr[scala.Boolean] = js.undefined,
    menu: java.lang.String = null,
    navigation: js.UndefOr[scala.Boolean] = js.undefined,
    navigationPosition: java.lang.String = null,
    navigationTooltips: js.Array[java.lang.String] = null,
    normalScrollElementTouchThreshold: scala.Int | scala.Double = null,
    normalScrollElements: java.lang.String = null,
    offsetSections: js.UndefOr[scala.Boolean] = js.undefined,
    onLeave: js.Function3[
      /* index */ scala.Double, 
      /* nextIndex */ scala.Double, 
      /* direction */ java.lang.String, 
      scala.Unit
    ] = null,
    onSlideLeave: js.Function5[
      /* anchorLink */ java.lang.String, 
      /* index */ scala.Double, 
      /* slideIndex */ scala.Double, 
      /* direction */ java.lang.String, 
      /* nextSlideIndex */ scala.Double, 
      scala.Unit
    ] = null,
    paddingBottom: java.lang.String = null,
    paddingTop: java.lang.String = null,
    parallax: js.UndefOr[scala.Boolean] = js.undefined,
    parallaxOptions: Anon_Cover = null,
    recordHistory: js.UndefOr[scala.Boolean] = js.undefined,
    resetSliders: js.UndefOr[scala.Boolean] = js.undefined,
    resize: js.UndefOr[scala.Boolean] = js.undefined,
    responsiveHeight: scala.Int | scala.Double = null,
    responsiveSlides: js.UndefOr[scala.Boolean] = js.undefined,
    responsiveWidth: scala.Int | scala.Double = null,
    scrollBar: js.UndefOr[scala.Boolean] = js.undefined,
    scrollHorizontally: js.UndefOr[scala.Boolean] = js.undefined,
    scrollOverflow: js.UndefOr[scala.Boolean] = js.undefined,
    scrollOverflowOptions: js.Any = null,
    scrollOverflowReset: js.UndefOr[scala.Boolean] = js.undefined,
    scrollingSpeed: scala.Int | scala.Double = null,
    sectionSelector: java.lang.String = null,
    sectionsColor: js.Array[java.lang.String] = null,
    showActiveTooltip: js.UndefOr[scala.Boolean] = js.undefined,
    slideSelector: java.lang.String = null,
    slidesNavPosition: java.lang.String = null,
    slidesNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    touchSensitivity: scala.Int | scala.Double = null,
    verticalCentered: js.UndefOr[scala.Boolean] = js.undefined
  ): FullPageJsOptions = {
    val __obj = js.Dynamic.literal()
    if (afterLoad != null) __obj.updateDynamic("afterLoad")(afterLoad)
    if (afterRender != null) __obj.updateDynamic("afterRender")(afterRender)
    if (afterResize != null) __obj.updateDynamic("afterResize")(afterResize)
    if (afterResponsive != null) __obj.updateDynamic("afterResponsive")(afterResponsive)
    if (afterSlideLoad != null) __obj.updateDynamic("afterSlideLoad")(afterSlideLoad)
    if (anchors != null) __obj.updateDynamic("anchors")(anchors)
    if (!js.isUndefined(animateAnchor)) __obj.updateDynamic("animateAnchor")(animateAnchor)
    if (!js.isUndefined(autoScrolling)) __obj.updateDynamic("autoScrolling")(autoScrolling)
    if (bigSectionsDestination != null) __obj.updateDynamic("bigSectionsDestination")(bigSectionsDestination.asInstanceOf[js.Any])
    if (!js.isUndefined(continuousHorizontal)) __obj.updateDynamic("continuousHorizontal")(continuousHorizontal)
    if (!js.isUndefined(continuousVertical)) __obj.updateDynamic("continuousVertical")(continuousVertical)
    if (!js.isUndefined(controlArrows)) __obj.updateDynamic("controlArrows")(controlArrows)
    if (!js.isUndefined(css3)) __obj.updateDynamic("css3")(css3)
    if (dragAndMove != null) __obj.updateDynamic("dragAndMove")(dragAndMove.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (easingcss3 != null) __obj.updateDynamic("easingcss3")(easingcss3)
    if (fadingEffect != null) __obj.updateDynamic("fadingEffect")(fadingEffect.asInstanceOf[js.Any])
    if (!js.isUndefined(fitToSection)) __obj.updateDynamic("fitToSection")(fitToSection)
    if (fitToSectionDelay != null) __obj.updateDynamic("fitToSectionDelay")(fitToSectionDelay.asInstanceOf[js.Any])
    if (fixedElements != null) __obj.updateDynamic("fixedElements")(fixedElements)
    if (interlockedSlides != null) __obj.updateDynamic("interlockedSlides")(interlockedSlides.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardScrolling)) __obj.updateDynamic("keyboardScrolling")(keyboardScrolling)
    if (!js.isUndefined(lazyLoading)) __obj.updateDynamic("lazyLoading")(lazyLoading)
    if (!js.isUndefined(lockAnchors)) __obj.updateDynamic("lockAnchors")(lockAnchors)
    if (!js.isUndefined(loopBottom)) __obj.updateDynamic("loopBottom")(loopBottom)
    if (!js.isUndefined(loopHorizontal)) __obj.updateDynamic("loopHorizontal")(loopHorizontal)
    if (!js.isUndefined(loopTop)) __obj.updateDynamic("loopTop")(loopTop)
    if (menu != null) __obj.updateDynamic("menu")(menu)
    if (!js.isUndefined(navigation)) __obj.updateDynamic("navigation")(navigation)
    if (navigationPosition != null) __obj.updateDynamic("navigationPosition")(navigationPosition)
    if (navigationTooltips != null) __obj.updateDynamic("navigationTooltips")(navigationTooltips)
    if (normalScrollElementTouchThreshold != null) __obj.updateDynamic("normalScrollElementTouchThreshold")(normalScrollElementTouchThreshold.asInstanceOf[js.Any])
    if (normalScrollElements != null) __obj.updateDynamic("normalScrollElements")(normalScrollElements)
    if (!js.isUndefined(offsetSections)) __obj.updateDynamic("offsetSections")(offsetSections)
    if (onLeave != null) __obj.updateDynamic("onLeave")(onLeave)
    if (onSlideLeave != null) __obj.updateDynamic("onSlideLeave")(onSlideLeave)
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom)
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop)
    if (!js.isUndefined(parallax)) __obj.updateDynamic("parallax")(parallax)
    if (parallaxOptions != null) __obj.updateDynamic("parallaxOptions")(parallaxOptions)
    if (!js.isUndefined(recordHistory)) __obj.updateDynamic("recordHistory")(recordHistory)
    if (!js.isUndefined(resetSliders)) __obj.updateDynamic("resetSliders")(resetSliders)
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize)
    if (responsiveHeight != null) __obj.updateDynamic("responsiveHeight")(responsiveHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(responsiveSlides)) __obj.updateDynamic("responsiveSlides")(responsiveSlides)
    if (responsiveWidth != null) __obj.updateDynamic("responsiveWidth")(responsiveWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollBar)) __obj.updateDynamic("scrollBar")(scrollBar)
    if (!js.isUndefined(scrollHorizontally)) __obj.updateDynamic("scrollHorizontally")(scrollHorizontally)
    if (!js.isUndefined(scrollOverflow)) __obj.updateDynamic("scrollOverflow")(scrollOverflow)
    if (scrollOverflowOptions != null) __obj.updateDynamic("scrollOverflowOptions")(scrollOverflowOptions)
    if (!js.isUndefined(scrollOverflowReset)) __obj.updateDynamic("scrollOverflowReset")(scrollOverflowReset)
    if (scrollingSpeed != null) __obj.updateDynamic("scrollingSpeed")(scrollingSpeed.asInstanceOf[js.Any])
    if (sectionSelector != null) __obj.updateDynamic("sectionSelector")(sectionSelector)
    if (sectionsColor != null) __obj.updateDynamic("sectionsColor")(sectionsColor)
    if (!js.isUndefined(showActiveTooltip)) __obj.updateDynamic("showActiveTooltip")(showActiveTooltip)
    if (slideSelector != null) __obj.updateDynamic("slideSelector")(slideSelector)
    if (slidesNavPosition != null) __obj.updateDynamic("slidesNavPosition")(slidesNavPosition)
    if (!js.isUndefined(slidesNavigation)) __obj.updateDynamic("slidesNavigation")(slidesNavigation)
    if (touchSensitivity != null) __obj.updateDynamic("touchSensitivity")(touchSensitivity.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalCentered)) __obj.updateDynamic("verticalCentered")(verticalCentered)
    __obj.asInstanceOf[FullPageJsOptions]
  }
}


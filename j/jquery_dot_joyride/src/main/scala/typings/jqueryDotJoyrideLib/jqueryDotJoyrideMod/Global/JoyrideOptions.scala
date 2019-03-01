package typings
package jqueryDotJoyrideLib.jqueryDotJoyrideMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JoyrideOptions extends js.Object {
  /**
  		 * true or false - false tour starts when restart called
  		 * @member {boolean}
  		 */
  var autoStart: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Will this cookie be attached to a domain, ie. '.notableapp.com'
  		 * @member {any}
  		 */
  var cookieDomain: js.UndefOr[js.Any] = js.undefined
  /**
  		 * true/false for whether cookies are used
  		 * @member {boolean}
  		 */
  var cookieMonster: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * choose your own cookie name
  		 * member {string}
  		 */
  var cookieName: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Set to '/' if you want the cookie for the whole website
  		 * @member {any}
  		 */
  var cookiePath: js.UndefOr[js.Any] = js.undefined
  /**
  		 *  Whether to expose the elements at each step in the tour (requires modal:true)
  		 * @member {boolean}
  		 */
  var expose: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * true or false to control whether localstorage is used
  		 * @member {boolean}
  		 */
  var localStorage: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Keyname in localstorage
  		 @member {string}
  		 */
  var localStorageKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Whether to cover page with modal during the tour
  		 * @member {boolean}
  		 */
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * true/false for next button visibility
  		 * @member {boolean}
  		 */
  var nextButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * override on a per tooltip bases
  		 * @member {any}
  		 */
  var nubPosition: js.UndefOr[js.Any] = js.undefined
  /**
  		 * array of indexes where to pause the tour after
  		 * @member {any[]}
  		 */
  var pauseAfter: js.UndefOr[js.Array[_]] = js.undefined
  /**
  		 * A method to call after an element has been exposed
  		 * @method
  		 * @param {number} index Tip Index
  		 * @param {JQuery} nextTip Tip object
  		 * @param {JQuery} el Element
  		 */
  var postExposeCallback: js.UndefOr[
    js.Function3[
      /* index */ scala.Double, 
      /* nextTip */ JQuery, 
      /* el */ js.UndefOr[JQuery], 
      scala.Unit
    ]
  ] = js.undefined
  /**
  		 * a method to call once the tour closes
  		 * @method
  		 * @param {number} index Current Tip Index
  		 * @param {JQuery} currentTip Current Tip object
  		 * @param {boolean} isAborted Is Aborted?
  		 */
  var postRideCallback: js.UndefOr[
    js.Function3[
      /* index */ scala.Double, 
      /* currentTip */ JQuery, 
      /* isAborted */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /**
  		 * A method to call after each step
  		 * @method
  		 * @param {number} index Current Tip Index
  		 * @param {JQuery} currentTip Current Tip object
  		 * @param {boolean} isAborted Is Aborted?
  		 */
  var postStepCallback: js.UndefOr[
    js.Function3[
      /* index */ scala.Double, 
      /* currentTip */ JQuery, 
      /* isAborted */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /**
  		 * A method to call before the tour starts (passed index, tip, and cloned exposed element)
  		 * @method
  		 * @param {number} index Current Tip Index
  		 * @param {JQuery} currentTip Current Tip object
  		 * @param {JQuery} el Element
  		 */
  var preRideCallback: js.UndefOr[
    js.Function3[
      /* index */ scala.Double, 
      /* currentTip */ JQuery, 
      /* el */ js.UndefOr[JQuery], 
      scala.Unit
    ]
  ] = js.undefined
  /**
  		 * A method to call before each step
  		 * @method
  		 * @param {number} index Tip Index
  		 * @param {JQuery} nextTip Tip object
  		 * @param {JQuery} el Element
  		 */
  var preStepCallback: js.UndefOr[
    js.Function3[
      /* index */ scala.Double, 
      /* nextTip */ JQuery, 
      /* el */ js.UndefOr[JQuery], 
      scala.Unit
    ]
  ] = js.undefined
  /**
  		 * whether to scroll to tips
  		 * @member {boolean}
  		 */
  var scroll: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Page scrolling speed in ms
  		 * @member {number}
  		 */
  var scrollSpeed: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * the index of the tooltip you want to start on (index of the li)
  		 * @member {number}
  		 */
  var startOffset: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * true/false to start timer on first click
  		 * @member {boolean}
  		 */
  var startTimerOnClick: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * HTML segments for tip layout
  		 * @member {JoyrideTemplate}
  		 */
  var template: js.UndefOr[JoyrideTemplate] = js.undefined
  /**
  		 * 0 = off, all other numbers = time(ms)
  		 * @member {number}
  		 */
  var timer: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * 'pop' or 'fade' in each tip
  		 * @member {string}
  		 */
  var tipAnimation: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * if 'fade'- speed in ms of transition
  		 * @member {number}
  		 */
  var tipAnimationFadeSpeed: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * Where the tip be attached if not inline
  		 * @member {HTMLElement}
  		 */
  var tipContainer: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /**
  		 * 'top' or 'bottom' in relation to parent
  		 * @member {string}
  		 */
  var tipLocation: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Version
  		 * @member {string}
  		 */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object JoyrideOptions {
  @scala.inline
  def apply(
    autoStart: js.UndefOr[scala.Boolean] = js.undefined,
    cookieDomain: js.Any = null,
    cookieMonster: js.UndefOr[scala.Boolean] = js.undefined,
    cookieName: java.lang.String = null,
    cookiePath: js.Any = null,
    expose: js.UndefOr[scala.Boolean] = js.undefined,
    localStorage: js.UndefOr[scala.Boolean] = js.undefined,
    localStorageKey: java.lang.String = null,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    nextButton: js.UndefOr[scala.Boolean] = js.undefined,
    nubPosition: js.Any = null,
    pauseAfter: js.Array[_] = null,
    postExposeCallback: js.Function3[
      /* index */ scala.Double, 
      /* nextTip */ JQuery, 
      /* el */ js.UndefOr[JQuery], 
      scala.Unit
    ] = null,
    postRideCallback: js.Function3[
      /* index */ scala.Double, 
      /* currentTip */ JQuery, 
      /* isAborted */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    postStepCallback: js.Function3[
      /* index */ scala.Double, 
      /* currentTip */ JQuery, 
      /* isAborted */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    preRideCallback: js.Function3[
      /* index */ scala.Double, 
      /* currentTip */ JQuery, 
      /* el */ js.UndefOr[JQuery], 
      scala.Unit
    ] = null,
    preStepCallback: js.Function3[
      /* index */ scala.Double, 
      /* nextTip */ JQuery, 
      /* el */ js.UndefOr[JQuery], 
      scala.Unit
    ] = null,
    scroll: js.UndefOr[scala.Boolean] = js.undefined,
    scrollSpeed: scala.Int | scala.Double = null,
    startOffset: scala.Int | scala.Double = null,
    startTimerOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    template: JoyrideTemplate = null,
    timer: scala.Int | scala.Double = null,
    tipAnimation: java.lang.String = null,
    tipAnimationFadeSpeed: scala.Int | scala.Double = null,
    tipContainer: stdLib.HTMLElement = null,
    tipLocation: java.lang.String = null,
    version: java.lang.String = null
  ): JoyrideOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart)
    if (cookieDomain != null) __obj.updateDynamic("cookieDomain")(cookieDomain)
    if (!js.isUndefined(cookieMonster)) __obj.updateDynamic("cookieMonster")(cookieMonster)
    if (cookieName != null) __obj.updateDynamic("cookieName")(cookieName)
    if (cookiePath != null) __obj.updateDynamic("cookiePath")(cookiePath)
    if (!js.isUndefined(expose)) __obj.updateDynamic("expose")(expose)
    if (!js.isUndefined(localStorage)) __obj.updateDynamic("localStorage")(localStorage)
    if (localStorageKey != null) __obj.updateDynamic("localStorageKey")(localStorageKey)
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (!js.isUndefined(nextButton)) __obj.updateDynamic("nextButton")(nextButton)
    if (nubPosition != null) __obj.updateDynamic("nubPosition")(nubPosition)
    if (pauseAfter != null) __obj.updateDynamic("pauseAfter")(pauseAfter)
    if (postExposeCallback != null) __obj.updateDynamic("postExposeCallback")(postExposeCallback)
    if (postRideCallback != null) __obj.updateDynamic("postRideCallback")(postRideCallback)
    if (postStepCallback != null) __obj.updateDynamic("postStepCallback")(postStepCallback)
    if (preRideCallback != null) __obj.updateDynamic("preRideCallback")(preRideCallback)
    if (preStepCallback != null) __obj.updateDynamic("preStepCallback")(preStepCallback)
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll)
    if (scrollSpeed != null) __obj.updateDynamic("scrollSpeed")(scrollSpeed.asInstanceOf[js.Any])
    if (startOffset != null) __obj.updateDynamic("startOffset")(startOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(startTimerOnClick)) __obj.updateDynamic("startTimerOnClick")(startTimerOnClick)
    if (template != null) __obj.updateDynamic("template")(template)
    if (timer != null) __obj.updateDynamic("timer")(timer.asInstanceOf[js.Any])
    if (tipAnimation != null) __obj.updateDynamic("tipAnimation")(tipAnimation)
    if (tipAnimationFadeSpeed != null) __obj.updateDynamic("tipAnimationFadeSpeed")(tipAnimationFadeSpeed.asInstanceOf[js.Any])
    if (tipContainer != null) __obj.updateDynamic("tipContainer")(tipContainer)
    if (tipLocation != null) __obj.updateDynamic("tipLocation")(tipLocation)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[JoyrideOptions]
  }
}


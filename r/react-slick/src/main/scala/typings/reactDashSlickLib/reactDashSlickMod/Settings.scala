package typings
package reactDashSlickLib.reactDashSlickMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var accessibility: js.UndefOr[scala.Boolean] = js.undefined
  var adaptiveHeight: js.UndefOr[scala.Boolean] = js.undefined
  var afterChange: js.UndefOr[js.Function1[/* currentSlide */ scala.Double, scala.Unit]] = js.undefined
  var appendDots: js.UndefOr[
    js.Function1[
      /* dots */ reactLib.reactMod.ReactNs.ReactNode, 
      reactLib.reactMod.Global.JSXNs.Element
    ]
  ] = js.undefined
  var arrows: js.UndefOr[scala.Boolean] = js.undefined
  var asNavFor: js.UndefOr[Slider] = js.undefined
  var autoplay: js.UndefOr[scala.Boolean] = js.undefined
  var autoplaySpeed: js.UndefOr[scala.Double] = js.undefined
  var beforeChange: js.UndefOr[
    js.Function2[/* currentSlide */ scala.Double, /* nextSlide */ scala.Double, scala.Unit]
  ] = js.undefined
  var centerMode: js.UndefOr[scala.Boolean] = js.undefined
  var centerPadding: js.UndefOr[java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var cssEase: js.UndefOr[java.lang.String] = js.undefined
  var customPaging: js.UndefOr[js.Function1[/* index */ scala.Double, reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
  var dots: js.UndefOr[scala.Boolean] = js.undefined
  var dotsClass: js.UndefOr[java.lang.String] = js.undefined
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var easing: js.UndefOr[java.lang.String] = js.undefined
  var edgeFriction: js.UndefOr[scala.Double] = js.undefined
  var fade: js.UndefOr[scala.Boolean] = js.undefined
  var focusOnSelect: js.UndefOr[scala.Boolean] = js.undefined
  var infinite: js.UndefOr[scala.Boolean] = js.undefined
  var initialSlide: js.UndefOr[scala.Double] = js.undefined
  var lazyLoad: js.UndefOr[LazyLoadTypes] = js.undefined
  var nextArrow: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  var onEdge: js.UndefOr[js.Function1[/* swipeDirection */ SwipeDirection, scala.Unit]] = js.undefined
  var onInit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onLazyLoad: js.UndefOr[js.Function1[/* slidesToLoad */ js.Array[scala.Double], scala.Unit]] = js.undefined
  var onReInit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onSwipe: js.UndefOr[js.Function1[/* swipeDirection */ SwipeDirection, scala.Unit]] = js.undefined
  var pauseOnDotsHover: js.UndefOr[scala.Boolean] = js.undefined
  var pauseOnFocus: js.UndefOr[scala.Boolean] = js.undefined
  var pauseOnHover: js.UndefOr[scala.Boolean] = js.undefined
  var prevArrow: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  var responsive: js.UndefOr[js.Array[ResponsiveObject]] = js.undefined
  var rows: js.UndefOr[scala.Double] = js.undefined
  var rtl: js.UndefOr[scala.Boolean] = js.undefined
  var slide: js.UndefOr[java.lang.String] = js.undefined
  var slidesPerRow: js.UndefOr[scala.Double] = js.undefined
  var slidesToScroll: js.UndefOr[scala.Double] = js.undefined
  var slidesToShow: js.UndefOr[scala.Double] = js.undefined
  var speed: js.UndefOr[scala.Double] = js.undefined
  var swipe: js.UndefOr[scala.Boolean] = js.undefined
  var swipeEvent: js.UndefOr[js.Function1[/* swipeDirection */ SwipeDirection, scala.Unit]] = js.undefined
  var swipeToSlide: js.UndefOr[scala.Boolean] = js.undefined
  var touchMove: js.UndefOr[scala.Boolean] = js.undefined
  var touchThreshold: js.UndefOr[scala.Double] = js.undefined
  var useCSS: js.UndefOr[scala.Boolean] = js.undefined
  var useTransform: js.UndefOr[scala.Boolean] = js.undefined
  var variableWidth: js.UndefOr[scala.Boolean] = js.undefined
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
  var waitForAnimate: js.UndefOr[scala.Boolean] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    accessibility: js.UndefOr[scala.Boolean] = js.undefined,
    adaptiveHeight: js.UndefOr[scala.Boolean] = js.undefined,
    afterChange: /* currentSlide */ scala.Double => scala.Unit = null,
    appendDots: /* dots */ reactLib.reactMod.ReactNs.ReactNode => reactLib.reactMod.Global.JSXNs.Element = null,
    arrows: js.UndefOr[scala.Boolean] = js.undefined,
    asNavFor: Slider = null,
    autoplay: js.UndefOr[scala.Boolean] = js.undefined,
    autoplaySpeed: scala.Int | scala.Double = null,
    beforeChange: (/* currentSlide */ scala.Double, /* nextSlide */ scala.Double) => scala.Unit = null,
    centerMode: js.UndefOr[scala.Boolean] = js.undefined,
    centerPadding: java.lang.String = null,
    className: java.lang.String = null,
    cssEase: java.lang.String = null,
    customPaging: /* index */ scala.Double => reactLib.reactMod.Global.JSXNs.Element = null,
    dots: js.UndefOr[scala.Boolean] = js.undefined,
    dotsClass: java.lang.String = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    easing: java.lang.String = null,
    edgeFriction: scala.Int | scala.Double = null,
    fade: js.UndefOr[scala.Boolean] = js.undefined,
    focusOnSelect: js.UndefOr[scala.Boolean] = js.undefined,
    infinite: js.UndefOr[scala.Boolean] = js.undefined,
    initialSlide: scala.Int | scala.Double = null,
    lazyLoad: LazyLoadTypes = null,
    nextArrow: reactLib.reactMod.Global.JSXNs.Element = null,
    onEdge: /* swipeDirection */ SwipeDirection => scala.Unit = null,
    onInit: () => scala.Unit = null,
    onLazyLoad: /* slidesToLoad */ js.Array[scala.Double] => scala.Unit = null,
    onReInit: () => scala.Unit = null,
    onSwipe: /* swipeDirection */ SwipeDirection => scala.Unit = null,
    pauseOnDotsHover: js.UndefOr[scala.Boolean] = js.undefined,
    pauseOnFocus: js.UndefOr[scala.Boolean] = js.undefined,
    pauseOnHover: js.UndefOr[scala.Boolean] = js.undefined,
    prevArrow: reactLib.reactMod.Global.JSXNs.Element = null,
    responsive: js.Array[ResponsiveObject] = null,
    rows: scala.Int | scala.Double = null,
    rtl: js.UndefOr[scala.Boolean] = js.undefined,
    slide: java.lang.String = null,
    slidesPerRow: scala.Int | scala.Double = null,
    slidesToScroll: scala.Int | scala.Double = null,
    slidesToShow: scala.Int | scala.Double = null,
    speed: scala.Int | scala.Double = null,
    swipe: js.UndefOr[scala.Boolean] = js.undefined,
    swipeEvent: /* swipeDirection */ SwipeDirection => scala.Unit = null,
    swipeToSlide: js.UndefOr[scala.Boolean] = js.undefined,
    touchMove: js.UndefOr[scala.Boolean] = js.undefined,
    touchThreshold: scala.Int | scala.Double = null,
    useCSS: js.UndefOr[scala.Boolean] = js.undefined,
    useTransform: js.UndefOr[scala.Boolean] = js.undefined,
    variableWidth: js.UndefOr[scala.Boolean] = js.undefined,
    vertical: js.UndefOr[scala.Boolean] = js.undefined,
    waitForAnimate: js.UndefOr[scala.Boolean] = js.undefined
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accessibility)) __obj.updateDynamic("accessibility")(accessibility)
    if (!js.isUndefined(adaptiveHeight)) __obj.updateDynamic("adaptiveHeight")(adaptiveHeight)
    if (afterChange != null) __obj.updateDynamic("afterChange")(js.Any.fromFunction1(afterChange))
    if (appendDots != null) __obj.updateDynamic("appendDots")(js.Any.fromFunction1(appendDots))
    if (!js.isUndefined(arrows)) __obj.updateDynamic("arrows")(arrows)
    if (asNavFor != null) __obj.updateDynamic("asNavFor")(asNavFor)
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (autoplaySpeed != null) __obj.updateDynamic("autoplaySpeed")(autoplaySpeed.asInstanceOf[js.Any])
    if (beforeChange != null) __obj.updateDynamic("beforeChange")(js.Any.fromFunction2(beforeChange))
    if (!js.isUndefined(centerMode)) __obj.updateDynamic("centerMode")(centerMode)
    if (centerPadding != null) __obj.updateDynamic("centerPadding")(centerPadding)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssEase != null) __obj.updateDynamic("cssEase")(cssEase)
    if (customPaging != null) __obj.updateDynamic("customPaging")(js.Any.fromFunction1(customPaging))
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots)
    if (dotsClass != null) __obj.updateDynamic("dotsClass")(dotsClass)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (edgeFriction != null) __obj.updateDynamic("edgeFriction")(edgeFriction.asInstanceOf[js.Any])
    if (!js.isUndefined(fade)) __obj.updateDynamic("fade")(fade)
    if (!js.isUndefined(focusOnSelect)) __obj.updateDynamic("focusOnSelect")(focusOnSelect)
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite)
    if (initialSlide != null) __obj.updateDynamic("initialSlide")(initialSlide.asInstanceOf[js.Any])
    if (lazyLoad != null) __obj.updateDynamic("lazyLoad")(lazyLoad)
    if (nextArrow != null) __obj.updateDynamic("nextArrow")(nextArrow)
    if (onEdge != null) __obj.updateDynamic("onEdge")(js.Any.fromFunction1(onEdge))
    if (onInit != null) __obj.updateDynamic("onInit")(js.Any.fromFunction0(onInit))
    if (onLazyLoad != null) __obj.updateDynamic("onLazyLoad")(js.Any.fromFunction1(onLazyLoad))
    if (onReInit != null) __obj.updateDynamic("onReInit")(js.Any.fromFunction0(onReInit))
    if (onSwipe != null) __obj.updateDynamic("onSwipe")(js.Any.fromFunction1(onSwipe))
    if (!js.isUndefined(pauseOnDotsHover)) __obj.updateDynamic("pauseOnDotsHover")(pauseOnDotsHover)
    if (!js.isUndefined(pauseOnFocus)) __obj.updateDynamic("pauseOnFocus")(pauseOnFocus)
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover)
    if (prevArrow != null) __obj.updateDynamic("prevArrow")(prevArrow)
    if (responsive != null) __obj.updateDynamic("responsive")(responsive)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl)
    if (slide != null) __obj.updateDynamic("slide")(slide)
    if (slidesPerRow != null) __obj.updateDynamic("slidesPerRow")(slidesPerRow.asInstanceOf[js.Any])
    if (slidesToScroll != null) __obj.updateDynamic("slidesToScroll")(slidesToScroll.asInstanceOf[js.Any])
    if (slidesToShow != null) __obj.updateDynamic("slidesToShow")(slidesToShow.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (!js.isUndefined(swipe)) __obj.updateDynamic("swipe")(swipe)
    if (swipeEvent != null) __obj.updateDynamic("swipeEvent")(js.Any.fromFunction1(swipeEvent))
    if (!js.isUndefined(swipeToSlide)) __obj.updateDynamic("swipeToSlide")(swipeToSlide)
    if (!js.isUndefined(touchMove)) __obj.updateDynamic("touchMove")(touchMove)
    if (touchThreshold != null) __obj.updateDynamic("touchThreshold")(touchThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(useCSS)) __obj.updateDynamic("useCSS")(useCSS)
    if (!js.isUndefined(useTransform)) __obj.updateDynamic("useTransform")(useTransform)
    if (!js.isUndefined(variableWidth)) __obj.updateDynamic("variableWidth")(variableWidth)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    if (!js.isUndefined(waitForAnimate)) __obj.updateDynamic("waitForAnimate")(waitForAnimate)
    __obj.asInstanceOf[Settings]
  }
}


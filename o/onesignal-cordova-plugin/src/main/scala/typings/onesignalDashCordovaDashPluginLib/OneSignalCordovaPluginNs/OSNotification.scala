package typings
package onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OSNotification extends js.Object {
  var adm_big_picture: js.UndefOr[java.lang.String] = js.undefined
  var adm_group: js.UndefOr[java.lang.String] = js.undefined
  var adm_group_message: js.UndefOr[js.Any] = js.undefined
  var adm_large_icon: js.UndefOr[java.lang.String] = js.undefined
  var adm_small_icon: js.UndefOr[java.lang.String] = js.undefined
  var adm_sound: js.UndefOr[java.lang.String] = js.undefined
  var amazon_background_data: js.UndefOr[scala.Boolean] = js.undefined
  var androidNotificationId: js.UndefOr[scala.Double] = js.undefined
  var android_accent_color: js.UndefOr[java.lang.String] = js.undefined
  var android_group: js.UndefOr[java.lang.String] = js.undefined
  var android_group_message: js.UndefOr[js.Any] = js.undefined
  var android_led_color: js.UndefOr[java.lang.String] = js.undefined
  var android_sound: js.UndefOr[java.lang.String] = js.undefined
  var android_visibility: js.UndefOr[scala.Double] = js.undefined
  var app_id: js.UndefOr[java.lang.String] = js.undefined
  var app_ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var big_picture: js.UndefOr[java.lang.String] = js.undefined
  var buttons: js.UndefOr[js.Any] = js.undefined
  var chrome_big_picture: js.UndefOr[java.lang.String] = js.undefined
  var chrome_icon: js.UndefOr[java.lang.String] = js.undefined
  var chrome_web_icon: js.UndefOr[java.lang.String] = js.undefined
  var content_available: js.UndefOr[scala.Boolean] = js.undefined
  var contents: js.Any
  var data: js.UndefOr[js.Any] = js.undefined
  var delayed_option: js.UndefOr[java.lang.String] = js.undefined
  var delivery_time_of_day: js.UndefOr[java.lang.String] = js.undefined
  var displayType: OSDisplayType
  var excluded_segments: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var firefox_icon: js.UndefOr[java.lang.String] = js.undefined
  var groupedNotifications: js.UndefOr[js.Array[OSNotificationPayload]] = js.undefined
  var headings: js.UndefOr[js.Any] = js.undefined
  var include_amazon_reg_ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var include_android_reg_ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var include_chrome_reg_ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var include_chrome_web_reg_ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var include_ios_tokens: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var include_player_ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var include_wp_uris: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var include_wp_wns_uris: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var included_segments: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var ios_badgeCount: js.UndefOr[scala.Double] = js.undefined
  var ios_badgeType: js.UndefOr[java.lang.String] = js.undefined
  var ios_category: js.UndefOr[java.lang.String] = js.undefined
  var ios_sound: js.UndefOr[java.lang.String] = js.undefined
  var isAdm: js.UndefOr[scala.Boolean] = js.undefined
  var isAndroid: js.UndefOr[scala.Boolean] = js.undefined
  var isAnyWeb: js.UndefOr[scala.Boolean] = js.undefined
  var isAppInFocus: scala.Boolean
  var isChrome: js.UndefOr[scala.Boolean] = js.undefined
  var isChromeWeb: js.UndefOr[scala.Boolean] = js.undefined
  var isIos: js.UndefOr[scala.Boolean] = js.undefined
  var isSafari: js.UndefOr[scala.Boolean] = js.undefined
  var isWP: js.UndefOr[scala.Boolean] = js.undefined
  var isWP_WNS: js.UndefOr[scala.Boolean] = js.undefined
  var large_icon: js.UndefOr[java.lang.String] = js.undefined
  var payload: OSNotificationPayload
  var priority: js.UndefOr[scala.Double] = js.undefined
  var send_after: js.UndefOr[java.lang.String] = js.undefined
  var shown: scala.Boolean
  var small_icon: js.UndefOr[java.lang.String] = js.undefined
  var tags: js.UndefOr[js.Array[_]] = js.undefined
  var template_id: js.UndefOr[java.lang.String] = js.undefined
  var ttl: js.UndefOr[scala.Double] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var wp_sound: js.UndefOr[java.lang.String] = js.undefined
  var wp_wns_sound: js.UndefOr[java.lang.String] = js.undefined
}

object OSNotification {
  @scala.inline
  def apply(
    contents: js.Any,
    displayType: OSDisplayType,
    isAppInFocus: scala.Boolean,
    payload: OSNotificationPayload,
    shown: scala.Boolean,
    adm_big_picture: java.lang.String = null,
    adm_group: java.lang.String = null,
    adm_group_message: js.Any = null,
    adm_large_icon: java.lang.String = null,
    adm_small_icon: java.lang.String = null,
    adm_sound: java.lang.String = null,
    amazon_background_data: js.UndefOr[scala.Boolean] = js.undefined,
    androidNotificationId: scala.Int | scala.Double = null,
    android_accent_color: java.lang.String = null,
    android_group: java.lang.String = null,
    android_group_message: js.Any = null,
    android_led_color: java.lang.String = null,
    android_sound: java.lang.String = null,
    android_visibility: scala.Int | scala.Double = null,
    app_id: java.lang.String = null,
    app_ids: js.Array[java.lang.String] = null,
    big_picture: java.lang.String = null,
    buttons: js.Any = null,
    chrome_big_picture: java.lang.String = null,
    chrome_icon: java.lang.String = null,
    chrome_web_icon: java.lang.String = null,
    content_available: js.UndefOr[scala.Boolean] = js.undefined,
    data: js.Any = null,
    delayed_option: java.lang.String = null,
    delivery_time_of_day: java.lang.String = null,
    excluded_segments: js.Array[java.lang.String] = null,
    firefox_icon: java.lang.String = null,
    groupedNotifications: js.Array[OSNotificationPayload] = null,
    headings: js.Any = null,
    include_amazon_reg_ids: js.Array[java.lang.String] = null,
    include_android_reg_ids: js.Array[java.lang.String] = null,
    include_chrome_reg_ids: js.Array[java.lang.String] = null,
    include_chrome_web_reg_ids: js.Array[java.lang.String] = null,
    include_ios_tokens: js.Array[java.lang.String] = null,
    include_player_ids: js.Array[java.lang.String] = null,
    include_wp_uris: js.Array[java.lang.String] = null,
    include_wp_wns_uris: js.Array[java.lang.String] = null,
    included_segments: js.Array[java.lang.String] = null,
    ios_badgeCount: scala.Int | scala.Double = null,
    ios_badgeType: java.lang.String = null,
    ios_category: java.lang.String = null,
    ios_sound: java.lang.String = null,
    isAdm: js.UndefOr[scala.Boolean] = js.undefined,
    isAndroid: js.UndefOr[scala.Boolean] = js.undefined,
    isAnyWeb: js.UndefOr[scala.Boolean] = js.undefined,
    isChrome: js.UndefOr[scala.Boolean] = js.undefined,
    isChromeWeb: js.UndefOr[scala.Boolean] = js.undefined,
    isIos: js.UndefOr[scala.Boolean] = js.undefined,
    isSafari: js.UndefOr[scala.Boolean] = js.undefined,
    isWP: js.UndefOr[scala.Boolean] = js.undefined,
    isWP_WNS: js.UndefOr[scala.Boolean] = js.undefined,
    large_icon: java.lang.String = null,
    priority: scala.Int | scala.Double = null,
    send_after: java.lang.String = null,
    small_icon: java.lang.String = null,
    tags: js.Array[_] = null,
    template_id: java.lang.String = null,
    ttl: scala.Int | scala.Double = null,
    url: java.lang.String = null,
    wp_sound: java.lang.String = null,
    wp_wns_sound: java.lang.String = null
  ): OSNotification = {
    val __obj = js.Dynamic.literal(contents = contents, displayType = displayType, isAppInFocus = isAppInFocus, payload = payload, shown = shown)
    if (adm_big_picture != null) __obj.updateDynamic("adm_big_picture")(adm_big_picture)
    if (adm_group != null) __obj.updateDynamic("adm_group")(adm_group)
    if (adm_group_message != null) __obj.updateDynamic("adm_group_message")(adm_group_message)
    if (adm_large_icon != null) __obj.updateDynamic("adm_large_icon")(adm_large_icon)
    if (adm_small_icon != null) __obj.updateDynamic("adm_small_icon")(adm_small_icon)
    if (adm_sound != null) __obj.updateDynamic("adm_sound")(adm_sound)
    if (!js.isUndefined(amazon_background_data)) __obj.updateDynamic("amazon_background_data")(amazon_background_data)
    if (androidNotificationId != null) __obj.updateDynamic("androidNotificationId")(androidNotificationId.asInstanceOf[js.Any])
    if (android_accent_color != null) __obj.updateDynamic("android_accent_color")(android_accent_color)
    if (android_group != null) __obj.updateDynamic("android_group")(android_group)
    if (android_group_message != null) __obj.updateDynamic("android_group_message")(android_group_message)
    if (android_led_color != null) __obj.updateDynamic("android_led_color")(android_led_color)
    if (android_sound != null) __obj.updateDynamic("android_sound")(android_sound)
    if (android_visibility != null) __obj.updateDynamic("android_visibility")(android_visibility.asInstanceOf[js.Any])
    if (app_id != null) __obj.updateDynamic("app_id")(app_id)
    if (app_ids != null) __obj.updateDynamic("app_ids")(app_ids)
    if (big_picture != null) __obj.updateDynamic("big_picture")(big_picture)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (chrome_big_picture != null) __obj.updateDynamic("chrome_big_picture")(chrome_big_picture)
    if (chrome_icon != null) __obj.updateDynamic("chrome_icon")(chrome_icon)
    if (chrome_web_icon != null) __obj.updateDynamic("chrome_web_icon")(chrome_web_icon)
    if (!js.isUndefined(content_available)) __obj.updateDynamic("content_available")(content_available)
    if (data != null) __obj.updateDynamic("data")(data)
    if (delayed_option != null) __obj.updateDynamic("delayed_option")(delayed_option)
    if (delivery_time_of_day != null) __obj.updateDynamic("delivery_time_of_day")(delivery_time_of_day)
    if (excluded_segments != null) __obj.updateDynamic("excluded_segments")(excluded_segments)
    if (firefox_icon != null) __obj.updateDynamic("firefox_icon")(firefox_icon)
    if (groupedNotifications != null) __obj.updateDynamic("groupedNotifications")(groupedNotifications)
    if (headings != null) __obj.updateDynamic("headings")(headings)
    if (include_amazon_reg_ids != null) __obj.updateDynamic("include_amazon_reg_ids")(include_amazon_reg_ids)
    if (include_android_reg_ids != null) __obj.updateDynamic("include_android_reg_ids")(include_android_reg_ids)
    if (include_chrome_reg_ids != null) __obj.updateDynamic("include_chrome_reg_ids")(include_chrome_reg_ids)
    if (include_chrome_web_reg_ids != null) __obj.updateDynamic("include_chrome_web_reg_ids")(include_chrome_web_reg_ids)
    if (include_ios_tokens != null) __obj.updateDynamic("include_ios_tokens")(include_ios_tokens)
    if (include_player_ids != null) __obj.updateDynamic("include_player_ids")(include_player_ids)
    if (include_wp_uris != null) __obj.updateDynamic("include_wp_uris")(include_wp_uris)
    if (include_wp_wns_uris != null) __obj.updateDynamic("include_wp_wns_uris")(include_wp_wns_uris)
    if (included_segments != null) __obj.updateDynamic("included_segments")(included_segments)
    if (ios_badgeCount != null) __obj.updateDynamic("ios_badgeCount")(ios_badgeCount.asInstanceOf[js.Any])
    if (ios_badgeType != null) __obj.updateDynamic("ios_badgeType")(ios_badgeType)
    if (ios_category != null) __obj.updateDynamic("ios_category")(ios_category)
    if (ios_sound != null) __obj.updateDynamic("ios_sound")(ios_sound)
    if (!js.isUndefined(isAdm)) __obj.updateDynamic("isAdm")(isAdm)
    if (!js.isUndefined(isAndroid)) __obj.updateDynamic("isAndroid")(isAndroid)
    if (!js.isUndefined(isAnyWeb)) __obj.updateDynamic("isAnyWeb")(isAnyWeb)
    if (!js.isUndefined(isChrome)) __obj.updateDynamic("isChrome")(isChrome)
    if (!js.isUndefined(isChromeWeb)) __obj.updateDynamic("isChromeWeb")(isChromeWeb)
    if (!js.isUndefined(isIos)) __obj.updateDynamic("isIos")(isIos)
    if (!js.isUndefined(isSafari)) __obj.updateDynamic("isSafari")(isSafari)
    if (!js.isUndefined(isWP)) __obj.updateDynamic("isWP")(isWP)
    if (!js.isUndefined(isWP_WNS)) __obj.updateDynamic("isWP_WNS")(isWP_WNS)
    if (large_icon != null) __obj.updateDynamic("large_icon")(large_icon)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (send_after != null) __obj.updateDynamic("send_after")(send_after)
    if (small_icon != null) __obj.updateDynamic("small_icon")(small_icon)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (template_id != null) __obj.updateDynamic("template_id")(template_id)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (wp_sound != null) __obj.updateDynamic("wp_sound")(wp_sound)
    if (wp_wns_sound != null) __obj.updateDynamic("wp_wns_sound")(wp_wns_sound)
    __obj.asInstanceOf[OSNotification]
  }
}


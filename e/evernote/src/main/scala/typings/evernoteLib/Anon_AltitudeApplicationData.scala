package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltitudeApplicationData extends js.Object {
  var altitude: js.UndefOr[scala.Double] = js.undefined
  var applicationData: js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.LazyMap] = js.undefined
  var author: js.UndefOr[java.lang.String] = js.undefined
  var classifications: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var contentClass: js.UndefOr[java.lang.String] = js.undefined
  var creatorId: js.UndefOr[scala.Double] = js.undefined
  var lastEditedBy: js.UndefOr[java.lang.String] = js.undefined
  var lastEditorId: js.UndefOr[scala.Double] = js.undefined
  var latitude: js.UndefOr[scala.Double] = js.undefined
  var longitude: js.UndefOr[scala.Double] = js.undefined
  var placeName: js.UndefOr[java.lang.String] = js.undefined
  var reminderDoneTime: js.UndefOr[scala.Double] = js.undefined
  var reminderOrder: js.UndefOr[scala.Double] = js.undefined
  var reminderTime: js.UndefOr[scala.Double] = js.undefined
  var shareDate: js.UndefOr[scala.Double] = js.undefined
  var source: js.UndefOr[java.lang.String] = js.undefined
  var sourceApplication: js.UndefOr[java.lang.String] = js.undefined
  var sourceURL: js.UndefOr[java.lang.String] = js.undefined
  var subjectDate: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AltitudeApplicationData {
  @scala.inline
  def apply(
    altitude: scala.Int | scala.Double = null,
    applicationData: evernoteLib.evernoteMod.EvernoteNs.LazyMap = null,
    author: java.lang.String = null,
    classifications: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    contentClass: java.lang.String = null,
    creatorId: scala.Int | scala.Double = null,
    lastEditedBy: java.lang.String = null,
    lastEditorId: scala.Int | scala.Double = null,
    latitude: scala.Int | scala.Double = null,
    longitude: scala.Int | scala.Double = null,
    placeName: java.lang.String = null,
    reminderDoneTime: scala.Int | scala.Double = null,
    reminderOrder: scala.Int | scala.Double = null,
    reminderTime: scala.Int | scala.Double = null,
    shareDate: scala.Int | scala.Double = null,
    source: java.lang.String = null,
    sourceApplication: java.lang.String = null,
    sourceURL: java.lang.String = null,
    subjectDate: scala.Int | scala.Double = null
  ): Anon_AltitudeApplicationData = {
    val __obj = js.Dynamic.literal()
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (applicationData != null) __obj.updateDynamic("applicationData")(applicationData)
    if (author != null) __obj.updateDynamic("author")(author)
    if (classifications != null) __obj.updateDynamic("classifications")(classifications)
    if (contentClass != null) __obj.updateDynamic("contentClass")(contentClass)
    if (creatorId != null) __obj.updateDynamic("creatorId")(creatorId.asInstanceOf[js.Any])
    if (lastEditedBy != null) __obj.updateDynamic("lastEditedBy")(lastEditedBy)
    if (lastEditorId != null) __obj.updateDynamic("lastEditorId")(lastEditorId.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (placeName != null) __obj.updateDynamic("placeName")(placeName)
    if (reminderDoneTime != null) __obj.updateDynamic("reminderDoneTime")(reminderDoneTime.asInstanceOf[js.Any])
    if (reminderOrder != null) __obj.updateDynamic("reminderOrder")(reminderOrder.asInstanceOf[js.Any])
    if (reminderTime != null) __obj.updateDynamic("reminderTime")(reminderTime.asInstanceOf[js.Any])
    if (shareDate != null) __obj.updateDynamic("shareDate")(shareDate.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (sourceApplication != null) __obj.updateDynamic("sourceApplication")(sourceApplication)
    if (sourceURL != null) __obj.updateDynamic("sourceURL")(sourceURL)
    if (subjectDate != null) __obj.updateDynamic("subjectDate")(subjectDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AltitudeApplicationData]
  }
}


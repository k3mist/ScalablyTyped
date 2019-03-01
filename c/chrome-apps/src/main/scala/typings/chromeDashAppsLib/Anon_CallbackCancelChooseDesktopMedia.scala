package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackCancelChooseDesktopMedia extends js.Object {
  val DesktopCaptureSourceType: Anon_AUDIO
  /**
    * Hides desktop media picker dialog shown by chooseDesktopMedia().
    * @param desktopMediaRequestId Id returned by chooseDesktopMedia()
    */
  def cancelChooseDesktopMedia(desktopMediaRequestId: chromeDashAppsLib.chromeNs.integer): scala.Unit
  /**
    * Shows desktop media picker UI with the specified set of sources.
    * @param sources Set of sources that should be shown to the user.
    * @param callback Provides an opaque string that can be passed to getUserMedia() API to generate media stream that corresponds to the source selected by the user.
    *                 If user didn't select any source (i.e. canceled the prompt) then the callback is called with an empty streamId.
    *                 The created streamId can be used only once and expires after a few seconds when it is not used.
    * @return Request ID to be used by cancelChooseDesktopMedia
    */
  def chooseDesktopMedia(
    sources: js.Array[
      chromeDashAppsLib.chromeNs.ToStringLiteral[
        /* import warning: ImportType.apply Failed type conversion: typeof DesktopCaptureSourceType */ js.Any, 
        java.lang.String, 
        stdLib.Exclude[
          java.lang.String, 
          /* import warning: ImportType.apply Failed type conversion: typeof DesktopCaptureSourceType[keyof typeof DesktopCaptureSourceType] */ js.Any
        ]
      ]
    ],
    callback: js.Function1[/* streamId */ java.lang.String, scala.Unit]
  ): chromeDashAppsLib.chromeNs.integer
}

object Anon_CallbackCancelChooseDesktopMedia {
  @scala.inline
  def apply(
    DesktopCaptureSourceType: Anon_AUDIO,
    cancelChooseDesktopMedia: js.Function1[chromeDashAppsLib.chromeNs.integer, scala.Unit],
    chooseDesktopMedia: js.Function2[
      js.Array[
        chromeDashAppsLib.chromeNs.ToStringLiteral[
          /* import warning: ImportType.apply Failed type conversion: typeof DesktopCaptureSourceType */ js.Any, 
          java.lang.String, 
          stdLib.Exclude[
            java.lang.String, 
            /* import warning: ImportType.apply Failed type conversion: typeof DesktopCaptureSourceType[keyof typeof DesktopCaptureSourceType] */ js.Any
          ]
        ]
      ], 
      js.Function1[/* streamId */ java.lang.String, scala.Unit], 
      chromeDashAppsLib.chromeNs.integer
    ]
  ): Anon_CallbackCancelChooseDesktopMedia = {
    val __obj = js.Dynamic.literal(DesktopCaptureSourceType = DesktopCaptureSourceType, cancelChooseDesktopMedia = cancelChooseDesktopMedia, chooseDesktopMedia = chooseDesktopMedia)
  
    __obj.asInstanceOf[Anon_CallbackCancelChooseDesktopMedia]
  }
}


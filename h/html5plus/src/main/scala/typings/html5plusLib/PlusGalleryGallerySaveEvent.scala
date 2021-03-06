package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 保存图片到相册成功事件
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
  */
trait PlusGalleryGallerySaveEvent extends js.Object {
  /**
    * 保存到相册的图片路径
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
}

object PlusGalleryGallerySaveEvent {
  @scala.inline
  def apply(path: java.lang.String = null): PlusGalleryGallerySaveEvent = {
    val __obj = js.Dynamic.literal()
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[PlusGalleryGallerySaveEvent]
  }
}


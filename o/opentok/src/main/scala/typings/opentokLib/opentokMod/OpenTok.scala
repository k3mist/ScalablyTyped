package typings
package opentokLib.opentokMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenTok extends js.Object {
  def createSession(
    options: opentokLib.opentokMod.OpenTokNs.SessionOptions,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* session */ opentokLib.opentokMod.OpenTokNs.Session, 
      scala.Unit
    ]
  ): scala.Unit
  def deleteArchive(archiveId: java.lang.String, callback: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit
  def generateToken(sessionId: java.lang.String, options: opentokLib.opentokMod.OpenTokNs.TokenOptions): opentokLib.opentokMod.OpenTokNs.Token
  def getArchive(
    archiveId: java.lang.String,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* archive */ opentokLib.opentokMod.OpenTokNs.Archive, 
      scala.Unit
    ]
  ): scala.Unit
  def listArchives(
    options: opentokLib.opentokMod.OpenTokNs.ListArchivesOptions,
    callback: js.Function3[
      /* err */ stdLib.Error, 
      /* archives */ js.Array[opentokLib.opentokMod.OpenTokNs.Archive], 
      /* totalCount */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit
  def startArchive(
    sessionId: java.lang.String,
    options: opentokLib.opentokMod.OpenTokNs.ArchiveOptions,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* archive */ opentokLib.opentokMod.OpenTokNs.Archive, 
      scala.Unit
    ]
  ): scala.Unit
  def stopArchive(
    archiveId: java.lang.String,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* archive */ opentokLib.opentokMod.OpenTokNs.Archive, 
      scala.Unit
    ]
  ): scala.Unit
}

object OpenTok {
  @scala.inline
  def apply(
    createSession: (opentokLib.opentokMod.OpenTokNs.SessionOptions, js.Function2[
      /* err */ stdLib.Error, 
      /* session */ opentokLib.opentokMod.OpenTokNs.Session, 
      scala.Unit
    ]) => scala.Unit,
    deleteArchive: (java.lang.String, js.Function1[/* err */ stdLib.Error, scala.Unit]) => scala.Unit,
    generateToken: (java.lang.String, opentokLib.opentokMod.OpenTokNs.TokenOptions) => opentokLib.opentokMod.OpenTokNs.Token,
    getArchive: (java.lang.String, js.Function2[
      /* err */ stdLib.Error, 
      /* archive */ opentokLib.opentokMod.OpenTokNs.Archive, 
      scala.Unit
    ]) => scala.Unit,
    listArchives: (opentokLib.opentokMod.OpenTokNs.ListArchivesOptions, js.Function3[
      /* err */ stdLib.Error, 
      /* archives */ js.Array[opentokLib.opentokMod.OpenTokNs.Archive], 
      /* totalCount */ scala.Double, 
      scala.Unit
    ]) => scala.Unit,
    startArchive: (java.lang.String, opentokLib.opentokMod.OpenTokNs.ArchiveOptions, js.Function2[
      /* err */ stdLib.Error, 
      /* archive */ opentokLib.opentokMod.OpenTokNs.Archive, 
      scala.Unit
    ]) => scala.Unit,
    stopArchive: (java.lang.String, js.Function2[
      /* err */ stdLib.Error, 
      /* archive */ opentokLib.opentokMod.OpenTokNs.Archive, 
      scala.Unit
    ]) => scala.Unit
  ): OpenTok = {
    val __obj = js.Dynamic.literal(createSession = js.Any.fromFunction2(createSession), deleteArchive = js.Any.fromFunction2(deleteArchive), generateToken = js.Any.fromFunction2(generateToken), getArchive = js.Any.fromFunction2(getArchive), listArchives = js.Any.fromFunction2(listArchives), startArchive = js.Any.fromFunction3(startArchive), stopArchive = js.Any.fromFunction2(stopArchive))
  
    __obj.asInstanceOf[OpenTok]
  }
}


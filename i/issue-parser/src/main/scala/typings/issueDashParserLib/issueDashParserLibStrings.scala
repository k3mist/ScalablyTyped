package typings
package issueDashParserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object issueDashParserLibStrings {
  @js.native
  sealed trait bitbucket
    extends issueDashParserLib.issueDashParserMod.issueParserNs.Options
  
  @js.native
  sealed trait github
    extends issueDashParserLib.issueDashParserMod.issueParserNs.Options
  
  @js.native
  sealed trait gitlab
    extends issueDashParserLib.issueDashParserMod.issueParserNs.Options
  
  @js.native
  sealed trait waffle
    extends issueDashParserLib.issueDashParserMod.issueParserNs.Options
  
  @scala.inline
  def bitbucket: bitbucket = "bitbucket".asInstanceOf[bitbucket]
  @scala.inline
  def github: github = "github".asInstanceOf[github]
  @scala.inline
  def gitlab: gitlab = "gitlab".asInstanceOf[gitlab]
  @scala.inline
  def waffle: waffle = "waffle".asInstanceOf[waffle]
}


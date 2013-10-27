package net.rrm.ehour.ui.financial.lock

import net.rrm.ehour.ui.common.panel.AbstractAjaxPanel
import net.rrm.ehour.ui.common.border.{GreyBlueRoundedBorder, GreyRoundedBorder}

class LockDetailsPanel(id: String) extends AbstractAjaxPanel[Unit](id) {
  override def onInitialize() {
    super.onInitialize()

    val outerBorder = new GreyRoundedBorder(LockDetailsPanel.OuterBorderId, "New")
    add(outerBorder)

    val innerBorder = new GreyBlueRoundedBorder(LockDetailsPanel.InnerBorderId)
    outerBorder.add(innerBorder)
  }
}

object LockDetailsPanel {
  val OuterBorderId = "outerBorder"
  val InnerBorderId = "innerBorder"
}
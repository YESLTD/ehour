package net.rrm.ehour.persistence.mail.dao

import net.rrm.ehour.persistence.dao.AbstractAnnotationDaoTest
import org.junit.Test
import org.springframework.beans.factory.annotation.Autowired

import static org.junit.Assert.assertEquals

class MailLogDaoHibernateImplTest extends AbstractAnnotationDaoTest {
    @Autowired
    private MailLogDao mailLogDao;

    MailLogDaoHibernateImplTest() {
        super("dataset-maillog.xml")
    }

    @Test
    void shouldFindMailLogOnEvent() {
        def xs = mailLogDao.findOnEvent("DD")
        assertEquals(1, xs.size())
    }
}

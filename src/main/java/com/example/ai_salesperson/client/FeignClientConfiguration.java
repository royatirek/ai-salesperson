package com.example.ai_salesperson.client;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignClientConfiguration {

    @Bean
    public RequestInterceptor requestInterceptor() {
        return new RequestInterceptor() {
            @Override
            public void apply(RequestTemplate template) {
                template.header("Accept", "application/json, text/javascript, */*; q=0.01");
                template.header("client-auth-method", "v1");
                template.header("client-id", "web-client/1.0");
                template.header("secret-key", "SdeF21dn1ll23ms1AEcn223Ln039kds");
                template.header("Cookie", "VISITOR_ID=d21214cb-b9e7-43b4-9f4f-8d5fa2faab92; ajs_anonymous_id=%22314a207c-1f3e-43a8-9764-0962780d9d77%22; ajs_group_id=null; n7HDToken=ReWC5EBxn7jGJGRXz0V2Zbc4jpX3J2hLLXxYkJosOEHHadFSxt9ftFU78rNPlztmHwOGxEY9mAKH6zLnS3lFNINEj/s7lLfvaC9mquZIWYJxJwnRgjlesd4+qKDIahe0k0CwtPPCi+jAI5xrDv572g==; OtherSessionInfo=\"sessionStartTime=1754858150587,lastVisitdate=2025-08-11 02:05:50,daysSinceLastVisit=7\"; EXPERIMENTS=\"searchexp_var2,sortbarremovalweb_v1,plpexp026web_var3,platformfee_v1,videosonweb_v1,completesearch_es,buynowwebs_v1,promovisnew_show,sqrectexpweb_v1,expressdeliveryenabled_v2,e2erefunds_baseline,codfeeweb_v1\"; EXPERIMENT_INFO_CLIENT=promotionvisibility_promovisibility$$e2erefunds_baseline; SecureSessionId=3fb3ad44-9ff5-48ef-91a8-b5bd0948cdb2; promotionvisibility_promovisibility=$$$$; EXPERIMENT_INFO_SERVER=searchalgo_searchexp_var2$$sortbardisable_sortbarremovalweb_v1$$plpsort_plpexp026web_var3$$platformfee_platformfee_v1$$videocontent_videosonweb_v1$$search_completesearch_es$$instantcheckout_buynowwebs_v1$$promotionvisibility_promovisnew_show$$sqrectpi_sqrectexpweb_v1$$expressdeliveryenabled_expressdeliveryenabled_v2$$e2erefunds_e2erefunds_baseline$$codsurcharge_codfeeweb_v1; product_image_layout=rectangle; VISITOR_TRACK=d21214cb-b9e7-43b4-9f4f-8d5fa2faab92; product_ar=ar-5-7; e2erefunds_baseline=; WEBSITE_customersegment=NB; WEBSITE_childrenGroup=NO_CHILDREN_INFO__CUSTOMIZE-NO_default; hs_persistent_ticket=1a9642af-082c-43da-950a-1accf41e058b; ajs_user_id=5108286; hs_customer_info={%22action%22:%22success%22%2C%22userId%22:5108286%2C%22firstName%22:%22Atirek%22%2C%22lastName%22:%22Roy%22%2C%22userName%22:%22Atirek.Roy%22%2C%22cartItemQty%22:0%2C%22email%22:%22royatirek@gmail.com%22%2C%22phoneNumber%22:%228135046164%22%2C%22isRegister%22:false%2C%22uuid%22:%220cc99b5f-d797-425a-ad1e-9cc65a1df4dd%22%2C%22mobileStatus%22:%22Verified%22%2C%22resendOTPAuto%22:true%2C%22isLoggedIn%22:true%2C%22experiments-value%22:%22searchexp_var2%2Csortbarremovalweb_v1%2Cplpexp026web_var3%2Cplatformfee_v1%2Cvideosonweb_v1%2Ccompletesearch_es%2Cbuynowwebs_v1%2Cpromovisnew_show%2Csqrectexpweb_v1%2Cexpressdeliveryenabled_v2%2Ce2erefunds_baseline%2Ccodfeeweb_v1%22}; cart_item_quantity=1; gc_cookie_data=%7B%22atc_user%22%3A%22NB%22%2C%22checkout_user%22%3A%22NB%22%2C%22step_duration%22%3A%222025-08-10T20%3A38%3A19.947Z%22%2C%22checkout_started_time%22%3A%222025-08-10T20%3A38%3A15.842Z%22%2C%22payment_retry%22%3A0%2C%22address_default_value%22%3A%22Default%22%7D");
            }
        };
    }
}

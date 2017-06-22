package example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration // DispatcherServlet用のコンフィギューレーションクラスを作成する
@EnableWebMvc // Spring MVC が提供しているコンフィギューレーションクラスがインポートされ、Spring MVC を利用するために必要なコンポーネントのBean定義が更新される
@ComponentScan("example.app") // 指定した example app パッケージ以下のアノテーションが付与されているクラスがスキャンされアプリケーションコンテキストにBean登録される
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	/*
	 * WEB-INF 以下を view ディレクトリとして登録
	 * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#configureViewResolvers(org.springframework.web.servlet.config.annotation.ViewResolverRegistry)
	 */
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp();
	}

}

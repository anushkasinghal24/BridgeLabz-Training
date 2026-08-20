package com.contacts.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = {"/", "/home"}, produces = MediaType.TEXT_HTML_VALUE)
    public String home() {
        return """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <title>Contacts App</title>
                    <style>
                        :root {
                            color-scheme: light;
                            font-family: Arial, Helvetica, sans-serif;
                        }

                        body {
                            margin: 0;
                            min-height: 100vh;
                            display: grid;
                            place-items: center;
                            background: linear-gradient(135deg, #f6f8fb 0%, #e9eef7 100%);
                        }

                        .card {
                            width: min(880px, calc(100vw - 32px));
                            background: #ffffff;
                            border: 1px solid #d9e1ee;
                            border-radius: 14px;
                            overflow: hidden;
                            box-shadow: 0 12px 35px rgba(25, 35, 60, 0.08);
                        }

                        .row {
                            display: grid;
                            grid-template-columns: 1fr 1.7fr;
                        }

                        .title {
                            padding: 18px 20px;
                            font-size: 28px;
                            font-weight: 700;
                            color: #2f3542;
                            border-right: 1px solid #d9e1ee;
                            background: #fbfcfe;
                        }

                        .content {
                            padding: 14px 20px 14px 30px;
                            font-size: 20px;
                            color: #2f3542;
                        }

                        ul {
                            margin: 0;
                            padding-left: 22px;
                        }

                        li + li {
                            margin-top: 6px;
                        }

                        @media (max-width: 700px) {
                            .row {
                                grid-template-columns: 1fr;
                            }

                            .title {
                                border-right: 0;
                                border-bottom: 1px solid #d9e1ee;
                                font-size: 24px;
                            }

                            .content {
                                font-size: 18px;
                            }
                        }
                    </style>
                </head>
                <body>
                    <main class="card" role="main" aria-label="Contacts App">
                        <section class="row">
                            <div class="title">Contacts App</div>
                            <div class="content">
                                <ul>
                                    <li>Layered Spring Boot structure with controller, service, repository, and mapper packages</li>
                                    <li>REST endpoints available under <code>/api/contacts</code></li>
                                </ul>
                            </div>
                        </section>
                    </main>
                </body>
                </html>
                """;
    }
}

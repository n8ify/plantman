create table plant (
                       plnt_id  bigint generated always as identity
                           constraint "plant_pkey" primary key,
                       plnt_name varchar(255) not null,
                       plnt_remark varchar(255),
                       plnt_plant_type varchar(50) not null,
                       plnt_growth_day int not null,
                       plnt_tag varchar(50),
                       plnt_available_to_plant boolean default false
);

create table thread (
                        thrd_id bigint generated always as identity
                            constraint "thread_pkey" primary key,
                        thrd_name varchar(255) not null,
                        thrd_type varchar(255) not null,
                        thrd_remark varchar(255),
                        thrd_size int not null,
                        thrd_row int not null,
                        thrd_col int not null
);

create table planting (
                          plni_id bigint generated always as identity
                              constraint "planting_pkey" primary key,
                          plni_plnt_id bigint not null
                              constraint "planting_plant_fk" references plant(plnt_id),
                          plni_thrd_id bigint not null
                              constraint "planting_thread_fk" references thread(thrd_id),
                          plni_thread_row int not null,
                          plni_thread_col int not null,
                          plnt_status varchar(10) not null,
                          plnt_remark varchar(255),
                          plnt_history text not null,
                          plni_plant_datetime timestamp not null,
                          plni_harvest_datetime timestamp
);

create unique index "planting_uq_idx" on planting(plni_thrd_id, plni_thread_row, plni_thread_col)
    where plnt_status != 'HARVESTED';